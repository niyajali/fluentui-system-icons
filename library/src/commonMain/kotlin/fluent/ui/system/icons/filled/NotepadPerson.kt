package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.NotepadPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NotepadPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.228f, 18f)
            curveTo(22.206f, 18f, 23f, 18.794f, 23f, 19.772f)
            verticalLineTo(19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.794f, 14.793f, 18f, 15.773f, 18f)
            horizontalLineTo(21.228f)
            close()
            moveTo(16.25f, 2f)
            curveTo(16.664f, 2f, 17f, 2.336f, 17f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(11.336f)
            curveTo(19.545f, 11.12f, 19.037f, 11f, 18.5f, 11f)
            curveTo(16.567f, 11f, 15f, 12.567f, 15f, 14.5f)
            curveTo(15f, 15.479f, 15.403f, 16.365f, 16.051f, 17f)
            horizontalLineTo(15.773f)
            curveTo(14.242f, 17f, 13f, 18.241f, 13f, 19.772f)
            verticalLineTo(19.875f)
            curveTo(13f, 20.614f, 13.214f, 21.355f, 13.665f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineTo(7f)
            verticalLineTo(2.75f)
            curveTo(7f, 2.336f, 7.336f, 2f, 7.75f, 2f)
            curveTo(8.164f, 2f, 8.5f, 2.336f, 8.5f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(11.25f)
            verticalLineTo(2.75f)
            curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
            curveTo(12.414f, 2f, 12.75f, 2.336f, 12.75f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(15.5f)
            verticalLineTo(2.75f)
            curveTo(15.5f, 2.336f, 15.836f, 2f, 16.25f, 2f)
            close()
            moveTo(8.25f, 16f)
            curveTo(7.836f, 16f, 7.5f, 16.336f, 7.5f, 16.75f)
            curveTo(7.5f, 17.164f, 7.836f, 17.5f, 8.25f, 17.5f)
            horizontalLineTo(11.25f)
            lineTo(11.327f, 17.496f)
            curveTo(11.705f, 17.458f, 12f, 17.138f, 12f, 16.75f)
            curveTo(12f, 16.362f, 11.705f, 16.042f, 11.327f, 16.004f)
            lineTo(11.25f, 16f)
            horizontalLineTo(8.25f)
            close()
            moveTo(18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            close()
            moveTo(8.25f, 12f)
            curveTo(7.836f, 12f, 7.5f, 12.336f, 7.5f, 12.75f)
            curveTo(7.5f, 13.164f, 7.836f, 13.5f, 8.25f, 13.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 13.5f, 14f, 13.164f, 14f, 12.75f)
            curveTo(14f, 12.336f, 13.664f, 12f, 13.25f, 12f)
            horizontalLineTo(8.25f)
            close()
            moveTo(8.25f, 8f)
            curveTo(7.836f, 8f, 7.5f, 8.336f, 7.5f, 8.75f)
            curveTo(7.5f, 9.164f, 7.836f, 9.5f, 8.25f, 9.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 9.5f, 16.5f, 9.164f, 16.5f, 8.75f)
            curveTo(16.5f, 8.336f, 16.164f, 8f, 15.75f, 8f)
            horizontalLineTo(8.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NotepadPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NotepadPerson, contentDescription = null)
    }
}
