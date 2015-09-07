//Marcos Lozano Mendez
//September 8, 2015
//Homework 2 
//Arithmetic: Calculate taxes and total cost

public class Arithmetic{
    public static void main(String[] args){
        
        int nSocks = 3; //number of socks
        double sockCost$ = 2.58; //cost of pair of socks
        
        int nGlasses = 6; //number of drinking glasses
        double glassCost$ = 2.29; //cost of a drinking glass
        
        int nEnvelopes = 1; //number of envelopes
        double envelopeCost$ = 3.25; //cost of an envelope
        
        double taxPercent = .06; //Percent of tax in PA
        
        //multiplication to find the cost and tax of each item
        double totalSockCost$ = nSocks * sockCost$; //total cost for the socks
        double sockTax$ = totalSockCost$ * taxPercent; //total tax for the socks
        sockTax$ = Math.round(sockTax$ * 100) / 100.00; //sock tax rounded to 2 decimal points
        
        double totalGlassCost$ = nGlasses * glassCost$; //total cost for the glasses
        double glassTax$ = totalGlassCost$ * taxPercent; //total tax for the glasses
        glassTax$ = Math.round(glassTax$ * 100) / 100.00; //glass tax rounded to 2 decimal points
        
        double totalEnvelopeCost$ = nEnvelopes * envelopeCost$; //total cost for the envelopes
        double envelopeTax$ = totalEnvelopeCost$ * taxPercent; //total tax for the envelopes
        envelopeTax$ = Math.round(envelopeTax$ * 100) / 100.00; //enveloope tax rounded to 2 decimal points
        
        //adding for the total cost
        double totalTax$ = sockTax$ + glassTax$ + envelopeTax$; //tax for all items
        double totalCost$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$; //cost of all items without tax
        double totalCostTax$ = totalCost$ + totalTax$; //total cost with tax
        
        //printlns to show the costs, taxes, and total costs
        System.out.println("Socks " + nSocks + " x $" + sockCost$ + " = $" + totalSockCost$ + " sale tax $" + sockTax$);
        System.out.println("Glass " + nGlasses + " x $" + glassCost$ + " = $" + totalGlassCost$ + " sale tax $" + glassTax$);
        System.out.println("Envelope " + nEnvelopes + " x $" + envelopeCost$ + " = $" + totalEnvelopeCost$ + " sale tax $" + envelopeTax$);
        System.out.println("Total cost before tax: $" + totalCost$);
        System.out.println("Total Tax:           + $" + totalTax$);
        System.out.println("Total cost with tax:   $" + totalCostTax$);
        
        
        
    }
    
}