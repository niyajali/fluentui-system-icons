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

public val FluentIcons.Filled.FilmstripImage: ImageVector
    get() {
        if (_FilmstripImage != null) {
            return _FilmstripImage!!
        }
        _FilmstripImage = ImageVector.Builder(
            name = "Filled.FilmstripImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 2f, 18f, 3.455f, 18f, 5.25f)
                verticalLineTo(8f)
                horizontalLineTo(12.25f)
                curveTo(9.903f, 8f, 8f, 9.903f, 8f, 12.25f)
                verticalLineTo(16f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 16f, 2f, 14.545f, 2f, 12.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(4.75f, 4f)
                curveTo(4.336f, 4f, 4f, 4.336f, 4f, 4.75f)
                verticalLineTo(5.25f)
                curveTo(4f, 5.664f, 4.336f, 6f, 4.75f, 6f)
                curveTo(5.164f, 6f, 5.5f, 5.664f, 5.5f, 5.25f)
                verticalLineTo(4.75f)
                curveTo(5.5f, 4.336f, 5.164f, 4f, 4.75f, 4f)
                close()
                moveTo(5.5f, 8.75f)
                curveTo(5.5f, 8.336f, 5.164f, 8f, 4.75f, 8f)
                curveTo(4.336f, 8f, 4f, 8.336f, 4f, 8.75f)
                verticalLineTo(9.25f)
                curveTo(4f, 9.664f, 4.336f, 10f, 4.75f, 10f)
                curveTo(5.164f, 10f, 5.5f, 9.664f, 5.5f, 9.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(15.25f, 4f)
                curveTo(14.836f, 4f, 14.5f, 4.336f, 14.5f, 4.75f)
                verticalLineTo(5.25f)
                curveTo(14.5f, 5.664f, 14.836f, 6f, 15.25f, 6f)
                curveTo(15.664f, 6f, 16f, 5.664f, 16f, 5.25f)
                verticalLineTo(4.75f)
                curveTo(16f, 4.336f, 15.664f, 4f, 15.25f, 4f)
                close()
                moveTo(5.5f, 12.75f)
                curveTo(5.5f, 12.336f, 5.164f, 12f, 4.75f, 12f)
                curveTo(4.336f, 12f, 4f, 12.336f, 4f, 12.75f)
                verticalLineTo(13.25f)
                curveTo(4f, 13.664f, 4.336f, 14f, 4.75f, 14f)
                curveTo(5.164f, 14f, 5.5f, 13.664f, 5.5f, 13.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(9f, 12.25f)
                curveTo(9f, 10.455f, 10.455f, 9f, 12.25f, 9f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 9f, 22f, 10.455f, 22f, 12.25f)
                verticalLineTo(18.75f)
                curveTo(22f, 19.359f, 21.833f, 19.929f, 21.541f, 20.416f)
                lineTo(17.054f, 16.107f)
                curveTo(16.189f, 15.298f, 14.845f, 15.298f, 13.98f, 16.107f)
                lineTo(9.48f, 20.451f)
                curveTo(9.176f, 19.956f, 9f, 19.373f, 9f, 18.75f)
                verticalLineTo(12.25f)
                close()
                moveTo(17.75f, 14.5f)
                curveTo(18.44f, 14.5f, 19f, 13.94f, 19f, 13.25f)
                curveTo(19f, 12.56f, 18.44f, 12f, 17.75f, 12f)
                curveTo(17.06f, 12f, 16.5f, 12.56f, 16.5f, 13.25f)
                curveTo(16.5f, 13.94f, 17.06f, 14.5f, 17.75f, 14.5f)
                close()
                moveTo(12.25f, 22f)
                curveTo(11.622f, 22f, 11.036f, 21.822f, 10.539f, 21.513f)
                lineTo(15.005f, 17.202f)
                curveTo(15.293f, 16.933f, 15.741f, 16.933f, 16.029f, 17.202f)
                lineTo(20.496f, 21.492f)
                curveTo(19.992f, 21.813f, 19.393f, 22f, 18.75f, 22f)
                horizontalLineTo(12.25f)
                close()
            }
        }.build()

        return _FilmstripImage!!
    }

@Suppress("ObjectPropertyName")
private var _FilmstripImage: ImageVector? = null

@Preview
@Composable
private fun FilmstripImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FilmstripImage, contentDescription = null)
    }
}
