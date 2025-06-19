package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ErrorCircle: ImageVector
    get() {
        if (_ErrorCircle != null) {
            return _ErrorCircle!!
        }
        _ErrorCircle = ImageVector.Builder(
            name = "Regular.ErrorCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.478f, 22f, 12f)
                curveTo(22f, 17.522f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.522f, 2f, 12f)
                curveTo(2f, 6.478f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(12f, 3.667f)
                curveTo(7.405f, 3.667f, 3.667f, 7.405f, 3.667f, 12f)
                curveTo(3.667f, 16.595f, 7.405f, 20.333f, 12f, 20.333f)
                curveTo(16.595f, 20.333f, 20.333f, 16.595f, 20.333f, 12f)
                curveTo(20.333f, 7.405f, 16.595f, 3.667f, 12f, 3.667f)
                close()
                moveTo(11.999f, 14.502f)
                curveTo(12.55f, 14.502f, 12.997f, 14.949f, 12.997f, 15.501f)
                curveTo(12.997f, 16.052f, 12.55f, 16.5f, 11.999f, 16.5f)
                curveTo(11.447f, 16.5f, 11f, 16.052f, 11f, 15.501f)
                curveTo(11f, 14.949f, 11.447f, 14.502f, 11.999f, 14.502f)
                close()
                moveTo(11.995f, 7f)
                curveTo(12.374f, 7f, 12.688f, 7.282f, 12.738f, 7.648f)
                lineTo(12.745f, 7.749f)
                lineTo(12.749f, 12.251f)
                curveTo(12.749f, 12.665f, 12.413f, 13.001f, 11.999f, 13.002f)
                curveTo(11.62f, 13.002f, 11.306f, 12.72f, 11.256f, 12.354f)
                lineTo(11.249f, 12.252f)
                lineTo(11.245f, 7.751f)
                curveTo(11.245f, 7.336f, 11.58f, 7f, 11.995f, 7f)
                close()
            }
        }.build()

        return _ErrorCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ErrorCircle: ImageVector? = null

@Preview
@Composable
private fun ErrorCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ErrorCircle, contentDescription = null)
    }
}
