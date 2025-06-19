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

public val FluentIcons.Filled.ShareScreenPersonOverlay: ImageVector
    get() {
        if (_ShareScreenPersonOverlay != null) {
            return _ShareScreenPersonOverlay!!
        }
        _ShareScreenPersonOverlay = ImageVector.Builder(
            name = "Filled.ShareScreenPersonOverlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
                verticalLineTo(14.5f)
                curveTo(22f, 12.567f, 20.433f, 11f, 18.5f, 11f)
                curveTo(16.567f, 11f, 15f, 12.567f, 15f, 14.5f)
                curveTo(15f, 15.479f, 15.402f, 16.365f, 16.051f, 17f)
                horizontalLineTo(15.773f)
                curveTo(14.242f, 17f, 13f, 18.24f, 13f, 19.772f)
                verticalLineTo(19.875f)
                curveTo(13f, 19.917f, 13.001f, 19.958f, 13.002f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(5f, 8f)
                verticalLineTo(12f)
                curveTo(5f, 12.552f, 5.448f, 13f, 6f, 13f)
                horizontalLineTo(11f)
                curveTo(11.552f, 13f, 12f, 12.552f, 12f, 12f)
                verticalLineTo(8f)
                curveTo(12f, 7.448f, 11.552f, 7f, 11f, 7f)
                horizontalLineTo(6f)
                curveTo(5.448f, 7f, 5f, 7.448f, 5f, 8f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _ShareScreenPersonOverlay!!
    }

@Suppress("ObjectPropertyName")
private var _ShareScreenPersonOverlay: ImageVector? = null

@Preview
@Composable
private fun ShareScreenPersonOverlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShareScreenPersonOverlay, contentDescription = null)
    }
}
