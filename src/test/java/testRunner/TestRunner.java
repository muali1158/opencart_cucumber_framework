package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {".//Features//Login.feature"},
		//features= {".//Features//LoginDDT.feature"},
		//features= {".//Features//LoginDDTExcel.feature"},
		//features= "@target/rerun.txt",
		
		glue= "stepDefinitions",
		//plugin is for generating cucumber reports
		plugin= {"pretty", 
				"html:reports/myreport.html",
				"json:reports/myreport.json",
				"rerun:target/rerun.txt"    //Mandatory to capture failures
				},
		/*By default it is false, if we change to true,it will cross check for
		 * every step in the feature file have its corresponding method is available or not*/
		dryRun=false,
		monochrome=true//To remove junk in the console output window
		//tags="@sanity"         //Scenarios tagged with @sanity
		//tags="@sanity and @regression" //Scenarios tagged with @sanity and @regression
		//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not @regression
		)

public class TestRunner {

}
