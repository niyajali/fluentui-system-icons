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

public val FluentIcons.Regular.Sticker: ImageVector
    get() {
        if (_Sticker != null) {
            return _Sticker!!
        }
        _Sticker = ImageVector.Builder(
            name = "Regular.Sticker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(13.129f)
                curveTo(21f, 13.725f, 20.763f, 14.298f, 20.341f, 14.72f)
                lineTo(14.72f, 20.341f)
                curveTo(14.298f, 20.763f, 13.725f, 21f, 13.129f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(13f)
                lineTo(13.001f, 16.437f)
                curveTo(12.78f, 16.469f, 12.555f, 16.491f, 12.327f, 16.502f)
                lineTo(12.001f, 16.51f)
                curveTo(10.652f, 16.51f, 9.42f, 16.128f, 8.323f, 15.369f)
                curveTo(7.983f, 15.134f, 7.898f, 14.667f, 8.133f, 14.326f)
                curveTo(8.369f, 13.985f, 8.836f, 13.9f, 9.177f, 14.136f)
                curveTo(10.021f, 14.72f, 10.956f, 15.01f, 12.001f, 15.01f)
                curveTo(12.463f, 15.01f, 12.904f, 14.953f, 13.325f, 14.839f)
                curveTo(13.821f, 13.81f, 14.841f, 13.085f, 16.038f, 13.007f)
                lineTo(16.251f, 13f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(18.439f, 14.5f)
                horizontalLineTo(16.251f)
                curveTo(15.333f, 14.5f, 14.58f, 15.207f, 14.507f, 16.107f)
                lineTo(14.501f, 16.25f)
                lineTo(14.5f, 18.439f)
                lineTo(18.439f, 14.5f)
                close()
                moveTo(9f, 7.751f)
                curveTo(9.69f, 7.751f, 10.25f, 8.31f, 10.25f, 9f)
                curveTo(10.25f, 9.69f, 9.69f, 10.25f, 9f, 10.25f)
                curveTo(8.31f, 10.25f, 7.751f, 9.69f, 7.751f, 9f)
                curveTo(7.751f, 8.31f, 8.31f, 7.751f, 9f, 7.751f)
                close()
                moveTo(15f, 7.751f)
                curveTo(15.69f, 7.751f, 16.25f, 8.31f, 16.25f, 9f)
                curveTo(16.25f, 9.69f, 15.69f, 10.25f, 15f, 10.25f)
                curveTo(14.311f, 10.25f, 13.751f, 9.69f, 13.751f, 9f)
                curveTo(13.751f, 8.31f, 14.311f, 7.751f, 15f, 7.751f)
                close()
            }
        }.build()

        return _Sticker!!
    }

@Suppress("ObjectPropertyName")
private var _Sticker: ImageVector? = null

@Preview
@Composable
private fun StickerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Sticker, contentDescription = null)
    }
}
