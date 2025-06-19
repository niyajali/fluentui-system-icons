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

public val FluentIcons.Regular.CodeBlock: ImageVector
    get() {
        if (_CodeBlock != null) {
            return _CodeBlock!!
        }
        _CodeBlock = ImageVector.Builder(
            name = "Regular.CodeBlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(10.53f, 9.28f)
                curveTo(10.823f, 8.987f, 10.823f, 8.513f, 10.53f, 8.22f)
                curveTo(10.237f, 7.927f, 9.763f, 7.927f, 9.47f, 8.22f)
                lineTo(6.22f, 11.47f)
                curveTo(5.927f, 11.763f, 5.927f, 12.237f, 6.22f, 12.53f)
                lineTo(9.47f, 15.78f)
                curveTo(9.763f, 16.073f, 10.237f, 16.073f, 10.53f, 15.78f)
                curveTo(10.823f, 15.487f, 10.823f, 15.013f, 10.53f, 14.72f)
                lineTo(7.811f, 12f)
                lineTo(10.53f, 9.28f)
                close()
                moveTo(14.53f, 8.22f)
                curveTo(14.237f, 7.927f, 13.763f, 7.927f, 13.47f, 8.22f)
                curveTo(13.177f, 8.513f, 13.177f, 8.987f, 13.47f, 9.28f)
                lineTo(16.189f, 12f)
                lineTo(13.47f, 14.72f)
                curveTo(13.177f, 15.013f, 13.177f, 15.487f, 13.47f, 15.78f)
                curveTo(13.763f, 16.073f, 14.237f, 16.073f, 14.53f, 15.78f)
                lineTo(17.78f, 12.53f)
                curveTo(18.073f, 12.237f, 18.073f, 11.763f, 17.78f, 11.47f)
                lineTo(14.53f, 8.22f)
                close()
            }
        }.build()

        return _CodeBlock!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBlock: ImageVector? = null

@Preview
@Composable
private fun CodeBlockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeBlock, contentDescription = null)
    }
}
