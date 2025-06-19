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

public val FluentIcons.Regular.LaptopBriefcase: ImageVector
    get() {
        if (_LaptopBriefcase != null) {
            return _LaptopBriefcase!!
        }
        _LaptopBriefcase = ImageVector.Builder(
            name = "Regular.LaptopBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(13.75f)
                curveTo(4f, 14.993f, 5.007f, 16f, 6.25f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14.5f)
                lineTo(6.25f, 14.5f)
                curveTo(5.836f, 14.5f, 5.5f, 14.164f, 5.5f, 13.75f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
                verticalLineTo(9f)
                horizontalLineTo(19.25f)
                curveTo(19.51f, 9f, 19.762f, 9.036f, 20f, 9.104f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                horizontalLineTo(6.25f)
                close()
                moveTo(2.75f, 17.5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 19f, 2f, 18.664f, 2f, 18.25f)
                curveTo(2f, 17.836f, 2.336f, 17.5f, 2.75f, 17.5f)
                close()
                moveTo(14f, 13f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 13f, 12f, 13.672f, 12f, 14.5f)
                verticalLineTo(19.5f)
                curveTo(12f, 20.328f, 12.672f, 21f, 13.5f, 21f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 21f, 23f, 20.328f, 23f, 19.5f)
                verticalLineTo(14.5f)
                curveTo(23f, 13.672f, 22.328f, 13f, 21.5f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11.75f)
                curveTo(21f, 10.783f, 20.216f, 10f, 19.25f, 10f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 10f, 14f, 10.783f, 14f, 11.75f)
                verticalLineTo(13f)
                close()
                moveTo(15.5f, 11.75f)
                curveTo(15.5f, 11.612f, 15.612f, 11.5f, 15.75f, 11.5f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 11.5f, 19.5f, 11.612f, 19.5f, 11.75f)
                verticalLineTo(13f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.75f)
                close()
            }
        }.build()

        return _LaptopBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopBriefcase: ImageVector? = null

@Preview
@Composable
private fun LaptopBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LaptopBriefcase, contentDescription = null)
    }
}
