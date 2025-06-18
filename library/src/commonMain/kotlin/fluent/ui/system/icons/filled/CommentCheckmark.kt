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

public val FluentUi.Filled.CommentCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
            curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
            curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
            close()
            moveTo(20.854f, 4.146f)
            curveTo(20.658f, 3.951f, 20.342f, 3.951f, 20.146f, 4.146f)
            lineTo(16.5f, 7.793f)
            lineTo(14.854f, 6.146f)
            curveTo(14.658f, 5.951f, 14.342f, 5.951f, 14.146f, 6.146f)
            curveTo(13.951f, 6.342f, 13.951f, 6.658f, 14.146f, 6.854f)
            lineTo(16.146f, 8.854f)
            curveTo(16.342f, 9.049f, 16.658f, 9.049f, 16.854f, 8.854f)
            lineTo(20.854f, 4.854f)
            curveTo(21.049f, 4.658f, 21.049f, 4.342f, 20.854f, 4.146f)
            close()
            moveTo(17.5f, 13f)
            curveTo(19.247f, 13f, 20.832f, 12.311f, 22f, 11.19f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(13f)
            lineTo(8f, 21.75f)
            curveTo(7.176f, 22.368f, 6f, 21.78f, 6f, 20.75f)
            verticalLineTo(18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 4.01f, 11f, 5.211f, 11f, 6.5f)
            curveTo(11f, 10.09f, 13.91f, 13f, 17.5f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CommentCheckmark, contentDescription = null)
    }
}
