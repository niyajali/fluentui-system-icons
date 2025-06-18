package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.LinkEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LinkEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.999f, 6f)
            curveTo(9.999f, 5.448f, 9.552f, 5f, 8.999f, 5f)
            horizontalLineTo(7f)
            lineTo(6.783f, 5.005f)
            curveTo(4.122f, 5.118f, 2f, 7.311f, 2f, 9.999f)
            curveTo(2f, 12.761f, 4.238f, 14.999f, 7f, 14.999f)
            horizontalLineTo(8.999f)
            lineTo(9.116f, 14.992f)
            curveTo(9.613f, 14.934f, 9.999f, 14.512f, 9.999f, 13.999f)
            curveTo(9.999f, 13.447f, 9.552f, 12.999f, 8.999f, 12.999f)
            horizontalLineTo(7f)
            lineTo(6.823f, 12.994f)
            curveTo(5.249f, 12.903f, 4f, 11.597f, 4f, 9.999f)
            curveTo(4f, 8.343f, 5.343f, 7f, 7f, 7f)
            horizontalLineTo(8.999f)
            lineTo(9.116f, 6.993f)
            curveTo(9.613f, 6.935f, 9.999f, 6.513f, 9.999f, 6f)
            close()
            moveTo(21.998f, 9.999f)
            curveTo(21.998f, 7.238f, 19.76f, 5f, 16.999f, 5f)
            horizontalLineTo(14.999f)
            lineTo(14.882f, 5.007f)
            curveTo(14.385f, 5.064f, 13.999f, 5.487f, 13.999f, 6f)
            curveTo(13.999f, 6.552f, 14.447f, 7f, 14.999f, 7f)
            horizontalLineTo(16.999f)
            lineTo(17.175f, 7.005f)
            curveTo(18.75f, 7.096f, 19.998f, 8.402f, 19.998f, 9.999f)
            lineTo(19.998f, 10.012f)
            curveTo(20.694f, 10.072f, 21.375f, 10.353f, 21.925f, 10.855f)
            curveTo(21.973f, 10.577f, 21.998f, 10.291f, 21.998f, 9.999f)
            close()
            moveTo(17.769f, 10.637f)
            curveTo(17.67f, 10.71f, 17.573f, 10.79f, 17.48f, 10.876f)
            curveTo(17.37f, 10.937f, 17.246f, 10.977f, 17.115f, 10.993f)
            lineTo(16.999f, 10.999f)
            horizontalLineTo(7f)
            curveTo(6.447f, 10.999f, 6f, 10.552f, 6f, 9.999f)
            curveTo(6f, 9.487f, 6.386f, 9.064f, 6.883f, 9.006f)
            lineTo(7f, 9f)
            horizontalLineTo(16.999f)
            curveTo(17.551f, 9f, 17.999f, 9.447f, 17.999f, 9.999f)
            curveTo(17.999f, 10.242f, 17.913f, 10.464f, 17.769f, 10.637f)
            close()
            moveTo(18.098f, 11.669f)
            lineTo(12.196f, 17.571f)
            curveTo(11.852f, 17.915f, 11.608f, 18.346f, 11.49f, 18.818f)
            lineTo(11.033f, 20.648f)
            curveTo(10.834f, 21.444f, 11.555f, 22.166f, 12.351f, 21.967f)
            lineTo(14.181f, 21.509f)
            curveTo(14.653f, 21.391f, 15.085f, 21.147f, 15.429f, 20.803f)
            lineTo(21.331f, 14.901f)
            curveTo(22.223f, 14.008f, 22.223f, 12.561f, 21.331f, 11.669f)
            curveTo(20.438f, 10.776f, 18.991f, 10.776f, 18.098f, 11.669f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LinkEdit, contentDescription = null)
    }
}
