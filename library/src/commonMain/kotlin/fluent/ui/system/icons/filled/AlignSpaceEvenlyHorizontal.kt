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

public val FluentIcons.Filled.AlignSpaceEvenlyHorizontal: ImageVector
    get() {
        if (_AlignSpaceEvenlyHorizontal != null) {
            return _AlignSpaceEvenlyHorizontal!!
        }
        _AlignSpaceEvenlyHorizontal = ImageVector.Builder(
            name = "Filled.AlignSpaceEvenlyHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 17.5f)
                curveTo(2f, 18.881f, 3.119f, 20f, 4.5f, 20f)
                horizontalLineTo(5.5f)
                curveTo(6.881f, 20f, 8f, 18.881f, 8f, 17.5f)
                lineTo(8f, 6.5f)
                curveTo(8f, 5.119f, 6.881f, 4f, 5.5f, 4f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 4f, 2f, 5.119f, 2f, 6.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(9f, 17.5f)
                curveTo(9f, 18.881f, 10.119f, 20f, 11.5f, 20f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 20f, 15f, 18.881f, 15f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(15f, 5.119f, 13.881f, 4f, 12.5f, 4f)
                horizontalLineTo(11.5f)
                curveTo(10.119f, 4f, 9f, 5.119f, 9f, 6.5f)
                lineTo(9f, 17.5f)
                close()
                moveTo(16f, 17.5f)
                curveTo(16f, 18.881f, 17.119f, 20f, 18.5f, 20f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 20f, 22f, 18.881f, 22f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(22f, 5.119f, 20.881f, 4f, 19.5f, 4f)
                horizontalLineTo(18.5f)
                curveTo(17.119f, 4f, 16f, 5.119f, 16f, 6.5f)
                lineTo(16f, 17.5f)
                close()
            }
        }.build()

        return _AlignSpaceEvenlyHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AlignSpaceEvenlyHorizontal: ImageVector? = null

@Preview
@Composable
private fun AlignSpaceEvenlyHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AlignSpaceEvenlyHorizontal, contentDescription = null)
    }
}
