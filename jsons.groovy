import groovy.json.*

// This is basically just a quick stub for any JSON counting you want to do

def filename = args[1]

try {
  def json = new JsonSlurper().parseText(new File(filename).text)
} catch(e) {
  println "Failed to evaluate JSON: " + e.toString()
}

def topLevelKeyCount = json.size()
println topLevelKeyCount
