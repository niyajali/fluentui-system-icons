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

public val FluentIcons.Filled.Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Filled.Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.77f, 5.79f)
                curveTo(22.069f, 5.503f, 22.078f, 5.028f, 21.79f, 4.73f)
                curveTo(21.503f, 4.431f, 21.028f, 4.422f, 20.73f, 4.71f)
                lineTo(13.98f, 11.21f)
                curveTo(13.681f, 11.497f, 13.672f, 11.972f, 13.96f, 12.27f)
                curveTo(14.247f, 12.569f, 14.722f, 12.578f, 15.02f, 12.29f)
                lineTo(21.77f, 5.79f)
                close()
                moveTo(18.987f, 5f)
                lineTo(4.55f, 5f)
                curveTo(3.142f, 5f, 2f, 6.142f, 2f, 7.55f)
                verticalLineTo(14.45f)
                curveTo(2f, 15.858f, 3.142f, 17f, 4.55f, 17f)
                lineTo(19.45f, 17f)
                curveTo(20.858f, 17f, 22f, 15.858f, 22f, 14.45f)
                verticalLineTo(7.55f)
                curveTo(22f, 7.365f, 21.98f, 7.185f, 21.943f, 7.012f)
                lineTo(15.714f, 13.011f)
                curveTo(15.018f, 13.681f, 13.91f, 13.66f, 13.239f, 12.964f)
                curveTo(12.569f, 12.268f, 12.59f, 11.16f, 13.286f, 10.489f)
                lineTo(18.987f, 5f)
                close()
                moveTo(4.5f, 9.25f)
                curveTo(4.5f, 8.836f, 4.836f, 8.5f, 5.25f, 8.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 8.5f, 8f, 8.836f, 8f, 9.25f)
                curveTo(8f, 9.664f, 7.664f, 10f, 7.25f, 10f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 10f, 4.5f, 9.664f, 4.5f, 9.25f)
                close()
                moveTo(4.5f, 12.75f)
                curveTo(4.5f, 12.336f, 4.836f, 12f, 5.25f, 12f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 12f, 11f, 12.336f, 11f, 12.75f)
                curveTo(11f, 13.164f, 10.664f, 13.5f, 10.25f, 13.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 13.5f, 4.5f, 13.164f, 4.5f, 12.75f)
                close()
            }
        }.build()

        return _Check!!
    }

@Suppress("ObjectPropertyName")
private var _Check: ImageVector? = null

@Preview
@Composable
private fun CheckPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Check, contentDescription = null)
    }
}
