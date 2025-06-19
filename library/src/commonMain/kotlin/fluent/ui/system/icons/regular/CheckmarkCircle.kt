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

public val FluentIcons.Regular.CheckmarkCircle: ImageVector
    get() {
        if (_CheckmarkCircle != null) {
            return _CheckmarkCircle!!
        }
        _CheckmarkCircle = ImageVector.Builder(
            name = "Regular.CheckmarkCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                close()
                moveTo(10.75f, 13.439f)
                lineTo(15.22f, 8.97f)
                curveTo(15.513f, 8.677f, 15.987f, 8.677f, 16.28f, 8.97f)
                curveTo(16.547f, 9.236f, 16.571f, 9.653f, 16.353f, 9.946f)
                lineTo(16.28f, 10.03f)
                lineTo(11.28f, 15.03f)
                curveTo(11.014f, 15.297f, 10.597f, 15.321f, 10.304f, 15.103f)
                lineTo(10.22f, 15.03f)
                lineTo(7.72f, 12.53f)
                curveTo(7.427f, 12.237f, 7.427f, 11.763f, 7.72f, 11.47f)
                curveTo(7.986f, 11.203f, 8.403f, 11.179f, 8.696f, 11.397f)
                lineTo(8.78f, 11.47f)
                lineTo(10.75f, 13.439f)
                lineTo(15.22f, 8.97f)
                lineTo(10.75f, 13.439f)
                close()
            }
        }.build()

        return _CheckmarkCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkCircle: ImageVector? = null

@Preview
@Composable
private fun CheckmarkCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CheckmarkCircle, contentDescription = null)
    }
}
