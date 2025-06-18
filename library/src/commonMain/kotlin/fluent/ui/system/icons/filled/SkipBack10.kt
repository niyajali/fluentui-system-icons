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

public val FluentUi.Filled.SkipBack10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SkipBack10",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 2.25f)
            curveTo(2.448f, 2.25f, 2f, 2.698f, 2f, 3.25f)
            verticalLineTo(9f)
            curveTo(2f, 9.552f, 2.448f, 10f, 3f, 10f)
            horizontalLineTo(8.25f)
            curveTo(8.802f, 10f, 9.25f, 9.552f, 9.25f, 9f)
            curveTo(9.25f, 8.448f, 8.802f, 8f, 8.25f, 8f)
            horizontalLineTo(4.863f)
            curveTo(5.848f, 6.821f, 7.071f, 5.887f, 8.545f, 5.431f)
            curveTo(10.56f, 4.807f, 12.688f, 4.861f, 14.651f, 5.591f)
            curveTo(16.632f, 6.328f, 18.462f, 7.822f, 19.373f, 9.484f)
            curveTo(19.639f, 9.969f, 20.246f, 10.146f, 20.731f, 9.88f)
            curveTo(21.215f, 9.615f, 21.392f, 9.007f, 21.127f, 8.523f)
            curveTo(19.952f, 6.38f, 17.712f, 4.596f, 15.349f, 3.716f)
            curveTo(12.967f, 2.83f, 10.385f, 2.768f, 7.954f, 3.52f)
            curveTo(6.378f, 4.008f, 5.068f, 4.899f, 4f, 5.979f)
            verticalLineTo(3.25f)
            curveTo(4f, 2.698f, 3.552f, 2.25f, 3f, 2.25f)
            close()
            moveTo(9.75f, 12f)
            curveTo(9.75f, 11.581f, 9.488f, 11.206f, 9.095f, 11.061f)
            curveTo(8.701f, 10.917f, 8.259f, 11.033f, 7.988f, 11.353f)
            curveTo(7.914f, 11.44f, 7.84f, 11.529f, 7.766f, 11.618f)
            curveTo(7.251f, 12.241f, 6.688f, 12.921f, 5.486f, 13.642f)
            curveTo(5.012f, 13.927f, 4.859f, 14.541f, 5.143f, 15.014f)
            curveTo(5.427f, 15.488f, 6.041f, 15.642f, 6.515f, 15.358f)
            curveTo(6.998f, 15.068f, 7.404f, 14.776f, 7.75f, 14.493f)
            verticalLineTo(20f)
            curveTo(7.75f, 20.552f, 8.198f, 21f, 8.75f, 21f)
            curveTo(9.303f, 21f, 9.75f, 20.552f, 9.75f, 20f)
            verticalLineTo(12f)
            close()
            moveTo(16.25f, 11f)
            curveTo(14.864f, 11f, 13.851f, 11.635f, 13.242f, 12.661f)
            curveTo(12.678f, 13.611f, 12.5f, 14.822f, 12.5f, 16f)
            curveTo(12.5f, 17.178f, 12.678f, 18.389f, 13.242f, 19.339f)
            curveTo(13.851f, 20.365f, 14.864f, 21f, 16.25f, 21f)
            curveTo(17.636f, 21f, 18.649f, 20.365f, 19.258f, 19.339f)
            curveTo(19.822f, 18.389f, 20f, 17.178f, 20f, 16f)
            curveTo(20f, 14.822f, 19.822f, 13.611f, 19.258f, 12.661f)
            curveTo(18.649f, 11.635f, 17.636f, 11f, 16.25f, 11f)
            close()
            moveTo(14.5f, 16f)
            curveTo(14.5f, 14.969f, 14.666f, 14.18f, 14.962f, 13.682f)
            curveTo(15.212f, 13.26f, 15.574f, 13f, 16.25f, 13f)
            curveTo(16.926f, 13f, 17.288f, 13.26f, 17.538f, 13.682f)
            curveTo(17.834f, 14.18f, 18f, 14.969f, 18f, 16f)
            curveTo(18f, 17.031f, 17.834f, 17.82f, 17.538f, 18.318f)
            curveTo(17.288f, 18.74f, 16.926f, 19f, 16.25f, 19f)
            curveTo(15.574f, 19f, 15.212f, 18.74f, 14.962f, 18.318f)
            curveTo(14.666f, 17.82f, 14.5f, 17.031f, 14.5f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SkipBack10Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SkipBack10, contentDescription = null)
    }
}
