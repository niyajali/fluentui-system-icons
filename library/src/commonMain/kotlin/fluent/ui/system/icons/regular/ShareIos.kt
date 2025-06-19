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

public val FluentIcons.Regular.ShareIos: ImageVector
    get() {
        if (_ShareIos != null) {
            return _ShareIos!!
        }
        _ShareIos = ImageVector.Builder(
            name = "Regular.ShareIos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.53f, 2.22f)
                curveTo(12.237f, 1.927f, 11.763f, 1.927f, 11.47f, 2.22f)
                lineTo(6.22f, 7.47f)
                curveTo(5.927f, 7.763f, 5.927f, 8.237f, 6.22f, 8.53f)
                curveTo(6.513f, 8.823f, 6.987f, 8.823f, 7.28f, 8.53f)
                lineTo(11.25f, 4.561f)
                verticalLineTo(15.25f)
                curveTo(11.25f, 15.664f, 11.586f, 16f, 12f, 16f)
                curveTo(12.414f, 16f, 12.75f, 15.664f, 12.75f, 15.25f)
                verticalLineTo(4.561f)
                lineTo(16.72f, 8.53f)
                curveTo(17.013f, 8.823f, 17.487f, 8.823f, 17.78f, 8.53f)
                curveTo(18.073f, 8.237f, 18.073f, 7.763f, 17.78f, 7.47f)
                lineTo(12.53f, 2.22f)
                close()
                moveTo(3.75f, 11f)
                curveTo(4.164f, 11f, 4.5f, 11.336f, 4.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(19.5f, 11.336f, 19.836f, 11f, 20.25f, 11f)
                curveTo(20.664f, 11f, 21f, 11.336f, 21f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(3f, 11.336f, 3.336f, 11f, 3.75f, 11f)
                close()
            }
        }.build()

        return _ShareIos!!
    }

@Suppress("ObjectPropertyName")
private var _ShareIos: ImageVector? = null

@Preview
@Composable
private fun ShareIosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShareIos, contentDescription = null)
    }
}
