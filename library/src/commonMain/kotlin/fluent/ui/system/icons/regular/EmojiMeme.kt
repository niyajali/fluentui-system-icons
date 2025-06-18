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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.EmojiMeme: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiMeme",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.004f, 6f)
            horizontalLineTo(18.024f)
            curveTo(16.485f, 4.455f, 14.355f, 3.499f, 12.002f, 3.499f)
            curveTo(9.648f, 3.499f, 7.518f, 4.455f, 5.979f, 6f)
            horizontalLineTo(3.999f)
            curveTo(5.824f, 3.571f, 8.729f, 1.999f, 12.002f, 1.999f)
            curveTo(15.274f, 1.999f, 18.179f, 3.571f, 20.004f, 6f)
            close()
            moveTo(3.5f, 12.001f)
            curveTo(3.5f, 11.662f, 3.52f, 11.328f, 3.558f, 11f)
            horizontalLineTo(2.049f)
            curveTo(2.017f, 11.329f, 2f, 11.663f, 2f, 12.001f)
            curveTo(2f, 17.524f, 6.478f, 22.002f, 12.002f, 22.002f)
            curveTo(17.188f, 22.002f, 21.452f, 18.055f, 21.954f, 13f)
            horizontalLineTo(21f)
            verticalLineTo(14f)
            horizontalLineTo(20.267f)
            curveTo(19.367f, 17.73f, 16.008f, 20.502f, 12.002f, 20.502f)
            curveTo(7.306f, 20.502f, 3.5f, 16.696f, 3.5f, 12.001f)
            close()
            moveTo(12.002f, 16.502f)
            curveTo(10.603f, 16.502f, 9.312f, 15.862f, 8.463f, 14.784f)
            curveTo(8.207f, 14.458f, 7.735f, 14.403f, 7.41f, 14.659f)
            curveTo(7.085f, 14.915f, 7.029f, 15.387f, 7.285f, 15.712f)
            curveTo(8.416f, 17.147f, 10.139f, 18.002f, 12.002f, 18.002f)
            curveTo(13.862f, 18.002f, 15.583f, 17.149f, 16.714f, 15.718f)
            curveTo(16.97f, 15.393f, 16.915f, 14.921f, 16.59f, 14.664f)
            curveTo(16.265f, 14.408f, 15.793f, 14.463f, 15.536f, 14.788f)
            curveTo(14.687f, 15.863f, 13.398f, 16.502f, 12.002f, 16.502f)
            close()
            moveTo(3f, 7f)
            horizontalLineTo(22f)
            verticalLineTo(10f)
            horizontalLineTo(21f)
            verticalLineTo(12f)
            horizontalLineTo(20f)
            verticalLineTo(13f)
            horizontalLineTo(15f)
            verticalLineTo(12f)
            horizontalLineTo(14f)
            verticalLineTo(10f)
            horizontalLineTo(12f)
            verticalLineTo(12f)
            horizontalLineTo(11f)
            verticalLineTo(13f)
            horizontalLineTo(6f)
            verticalLineTo(12f)
            horizontalLineTo(5f)
            verticalLineTo(10f)
            horizontalLineTo(4f)
            verticalLineTo(9f)
            horizontalLineTo(2f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(7f)
            close()
            moveTo(1f, 10f)
            verticalLineTo(9f)
            horizontalLineTo(2f)
            verticalLineTo(10f)
            horizontalLineTo(1f)
            close()
            moveTo(1f, 10f)
            horizontalLineTo(0f)
            verticalLineTo(12f)
            horizontalLineTo(1f)
            verticalLineTo(10f)
            close()
            moveTo(7f, 9f)
            horizontalLineTo(6f)
            verticalLineTo(10f)
            horizontalLineTo(7f)
            verticalLineTo(11f)
            horizontalLineTo(8f)
            verticalLineTo(10f)
            horizontalLineTo(7f)
            verticalLineTo(9f)
            close()
            moveTo(16f, 9f)
            horizontalLineTo(15f)
            verticalLineTo(10f)
            horizontalLineTo(16f)
            verticalLineTo(11f)
            horizontalLineTo(17f)
            verticalLineTo(10f)
            horizontalLineTo(16f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiMemePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EmojiMeme, contentDescription = null)
    }
}
