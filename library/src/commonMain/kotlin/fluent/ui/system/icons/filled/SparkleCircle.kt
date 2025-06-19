package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.SparkleCircle: ImageVector
    get() {
        if (_SparkleCircle != null) {
            return _SparkleCircle!!
        }
        _SparkleCircle = ImageVector.Builder(
            name = "Filled.SparkleCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(8.558f, 6.167f)
                curveTo(8.872f, 5.278f, 10.129f, 5.278f, 10.443f, 6.166f)
                lineTo(10.902f, 7.461f)
                curveTo(11.008f, 7.759f, 11.243f, 7.994f, 11.541f, 8.1f)
                lineTo(12.835f, 8.558f)
                curveTo(13.723f, 8.872f, 13.723f, 10.129f, 12.835f, 10.443f)
                lineTo(11.542f, 10.901f)
                curveTo(11.243f, 11.007f, 11.008f, 11.242f, 10.902f, 11.54f)
                lineTo(10.444f, 12.835f)
                curveTo(10.129f, 13.724f, 8.872f, 13.723f, 8.558f, 12.834f)
                lineTo(8.101f, 11.541f)
                curveTo(7.995f, 11.242f, 7.76f, 11.007f, 7.461f, 10.901f)
                lineTo(6.167f, 10.443f)
                curveTo(5.278f, 10.129f, 5.278f, 8.872f, 6.167f, 8.558f)
                lineTo(7.461f, 8.1f)
                curveTo(7.76f, 7.994f, 7.995f, 7.759f, 8.101f, 7.46f)
                lineTo(8.558f, 6.167f)
                close()
                moveTo(15.949f, 12.706f)
                lineTo(16.128f, 13.303f)
                curveTo(16.21f, 13.577f, 16.424f, 13.791f, 16.698f, 13.873f)
                lineTo(17.296f, 14.053f)
                curveTo(18.236f, 14.335f, 18.236f, 15.667f, 17.296f, 15.949f)
                lineTo(16.698f, 16.129f)
                curveTo(16.424f, 16.211f, 16.21f, 16.425f, 16.128f, 16.699f)
                lineTo(15.949f, 17.296f)
                curveTo(15.667f, 18.237f, 14.334f, 18.237f, 14.052f, 17.297f)
                lineTo(13.872f, 16.698f)
                curveTo(13.79f, 16.424f, 13.576f, 16.209f, 13.302f, 16.128f)
                lineTo(12.706f, 15.949f)
                curveTo(11.765f, 15.668f, 11.764f, 14.335f, 12.705f, 14.052f)
                lineTo(13.303f, 13.873f)
                curveTo(13.576f, 13.791f, 13.79f, 13.577f, 13.872f, 13.304f)
                lineTo(14.052f, 12.705f)
                curveTo(14.335f, 11.765f, 15.667f, 11.765f, 15.949f, 12.706f)
                close()
            }
        }.build()

        return _SparkleCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SparkleCircle: ImageVector? = null

@Preview
@Composable
private fun SparkleCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SparkleCircle, contentDescription = null)
    }
}
