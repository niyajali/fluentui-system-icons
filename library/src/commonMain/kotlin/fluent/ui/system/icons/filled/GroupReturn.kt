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

public val FluentIcons.Filled.GroupReturn: ImageVector
    get() {
        if (_GroupReturn != null) {
            return _GroupReturn!!
        }
        _GroupReturn = ImageVector.Builder(
            name = "Filled.GroupReturn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 5f)
                curveTo(7f, 6.105f, 6.105f, 7f, 5f, 7f)
                curveTo(3.895f, 7f, 3f, 6.105f, 3f, 5f)
                curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
                curveTo(6.105f, 3f, 7f, 3.895f, 7f, 5f)
                close()
                moveTo(21f, 5f)
                curveTo(21f, 6.105f, 20.105f, 7f, 19f, 7f)
                curveTo(17.895f, 7f, 17f, 6.105f, 17f, 5f)
                curveTo(17f, 3.895f, 17.895f, 3f, 19f, 3f)
                curveTo(20.105f, 3f, 21f, 3.895f, 21f, 5f)
                close()
                moveTo(7f, 19f)
                curveTo(7f, 20.105f, 6.105f, 21f, 5f, 21f)
                curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
                curveTo(3f, 17.895f, 3.895f, 17f, 5f, 17f)
                curveTo(6.105f, 17f, 7f, 17.895f, 7f, 19f)
                close()
                moveTo(8f, 5f)
                curveTo(8f, 5.351f, 7.94f, 5.687f, 7.829f, 6f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 6f, 13f, 6.224f, 13f, 6.5f)
                verticalLineTo(9f)
                horizontalLineTo(11.5f)
                curveTo(10.119f, 9f, 9f, 10.119f, 9f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 13f, 6f, 12.776f, 6f, 12.5f)
                verticalLineTo(7.829f)
                curveTo(5.687f, 7.94f, 5.351f, 8f, 5f, 8f)
                curveTo(4.649f, 8f, 4.313f, 7.94f, 4f, 7.829f)
                verticalLineTo(12.5f)
                curveTo(4f, 13.881f, 5.119f, 15f, 6.5f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(17.5f)
                curveTo(9f, 18.88f, 10.118f, 19.999f, 11.498f, 20f)
                curveTo(11.177f, 19.23f, 11f, 18.386f, 11f, 17.5f)
                verticalLineTo(11.5f)
                curveTo(11f, 11.224f, 11.224f, 11f, 11.5f, 11f)
                horizontalLineTo(17.5f)
                curveTo(18.386f, 11f, 19.23f, 11.177f, 20f, 11.498f)
                curveTo(19.999f, 10.118f, 18.88f, 9f, 17.5f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(6.5f)
                curveTo(15f, 5.119f, 13.881f, 4f, 12.5f, 4f)
                horizontalLineTo(7.829f)
                curveTo(7.94f, 4.313f, 8f, 4.649f, 8f, 5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(15.707f, 16f)
                lineTo(16.354f, 15.354f)
                curveTo(16.549f, 15.158f, 16.549f, 14.842f, 16.354f, 14.646f)
                curveTo(16.158f, 14.451f, 15.842f, 14.451f, 15.646f, 14.646f)
                lineTo(14.146f, 16.146f)
                curveTo(13.951f, 16.342f, 13.951f, 16.658f, 14.146f, 16.854f)
                lineTo(15.646f, 18.354f)
                curveTo(15.842f, 18.549f, 16.158f, 18.549f, 16.354f, 18.354f)
                curveTo(16.549f, 18.158f, 16.549f, 17.842f, 16.354f, 17.646f)
                lineTo(15.707f, 17f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 17f, 20f, 18.007f, 20f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(20f, 19.776f, 20.224f, 20f, 20.5f, 20f)
                curveTo(20.776f, 20f, 21f, 19.776f, 21f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(21f, 17.455f, 19.545f, 16f, 17.75f, 16f)
                horizontalLineTo(15.707f)
                close()
            }
        }.build()

        return _GroupReturn!!
    }

@Suppress("ObjectPropertyName")
private var _GroupReturn: ImageVector? = null

@Preview
@Composable
private fun GroupReturnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GroupReturn, contentDescription = null)
    }
}
