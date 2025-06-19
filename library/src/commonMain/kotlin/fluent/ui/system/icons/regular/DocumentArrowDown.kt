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

public val FluentIcons.Regular.DocumentArrowDown: ImageVector
    get() {
        if (_DocumentArrowDown != null) {
            return _DocumentArrowDown!!
        }
        _DocumentArrowDown = ImageVector.Builder(
            name = "Regular.DocumentArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 2f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(11.498f)
                curveTo(4.474f, 11.3f, 4.977f, 11.157f, 5.5f, 11.076f)
                verticalLineTo(4f)
                curveTo(5.5f, 3.724f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
                horizontalLineTo(12.268f)
                curveTo(11.981f, 21.051f, 11.617f, 21.556f, 11.19f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.297f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.586f, 2.586f)
                curveTo(13.211f, 2.211f, 12.703f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                close()
                moveTo(17.379f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                verticalLineTo(4.621f)
                lineTo(17.379f, 8.5f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(7f, 14.5f)
                curveTo(7f, 14.224f, 6.776f, 14f, 6.5f, 14f)
                curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
                verticalLineTo(19.293f)
                lineTo(4.354f, 17.646f)
                curveTo(4.158f, 17.451f, 3.842f, 17.451f, 3.646f, 17.646f)
                curveTo(3.451f, 17.842f, 3.451f, 18.158f, 3.646f, 18.354f)
                lineTo(6.146f, 20.854f)
                curveTo(6.342f, 21.049f, 6.658f, 21.049f, 6.854f, 20.854f)
                lineTo(9.354f, 18.354f)
                curveTo(9.549f, 18.158f, 9.549f, 17.842f, 9.354f, 17.646f)
                curveTo(9.158f, 17.451f, 8.842f, 17.451f, 8.646f, 17.646f)
                lineTo(7f, 19.293f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _DocumentArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentArrowDown: ImageVector? = null

@Preview
@Composable
private fun DocumentArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentArrowDown, contentDescription = null)
    }
}
