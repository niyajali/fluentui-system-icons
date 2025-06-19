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

public val FluentIcons.Regular.ImageBorder: ImageVector
    get() {
        if (_ImageBorder != null) {
            return _ImageBorder!!
        }
        _ImageBorder = ImageVector.Builder(
            name = "Regular.ImageBorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 9f)
                curveTo(13.448f, 9f, 13f, 9.448f, 13f, 10f)
                curveTo(13f, 10.552f, 13.448f, 11f, 14f, 11f)
                curveTo(14.552f, 11f, 15f, 10.552f, 15f, 10f)
                curveTo(15f, 9.448f, 14.552f, 9f, 14f, 9f)
                close()
                moveTo(7.25f, 6.5f)
                curveTo(6.836f, 6.5f, 6.5f, 6.836f, 6.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(6.5f, 17.164f, 6.836f, 17.5f, 7.25f, 17.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 17.5f, 17.5f, 17.164f, 17.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(17.5f, 6.836f, 17.164f, 6.5f, 16.75f, 6.5f)
                horizontalLineTo(7.25f)
                close()
                moveTo(10.409f, 12.659f)
                lineTo(8f, 15.068f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(15.068f)
                lineTo(13.591f, 12.659f)
                curveTo(12.712f, 11.78f, 11.288f, 11.78f, 10.409f, 12.659f)
                close()
                moveTo(12.53f, 13.72f)
                lineTo(14.811f, 16f)
                horizontalLineTo(9.189f)
                lineTo(11.47f, 13.72f)
                curveTo(11.763f, 13.427f, 12.237f, 13.427f, 12.53f, 13.72f)
                close()
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
            }
        }.build()

        return _ImageBorder!!
    }

@Suppress("ObjectPropertyName")
private var _ImageBorder: ImageVector? = null

@Preview
@Composable
private fun ImageBorderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageBorder, contentDescription = null)
    }
}
