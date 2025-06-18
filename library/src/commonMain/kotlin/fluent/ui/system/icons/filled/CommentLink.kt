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

public val FluentUi.Filled.CommentLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 5.75f)
            curveTo(23f, 3.679f, 21.321f, 2f, 19.25f, 2f)
            lineTo(19.148f, 2.007f)
            curveTo(18.782f, 2.057f, 18.5f, 2.37f, 18.5f, 2.75f)
            curveTo(18.5f, 3.164f, 18.836f, 3.5f, 19.25f, 3.5f)
            lineTo(19.404f, 3.505f)
            curveTo(20.575f, 3.584f, 21.5f, 4.559f, 21.5f, 5.75f)
            curveTo(21.5f, 6.993f, 20.493f, 8f, 19.25f, 8f)
            lineTo(19.247f, 8.005f)
            lineTo(19.145f, 8.012f)
            curveTo(18.779f, 8.063f, 18.498f, 8.378f, 18.5f, 8.758f)
            curveTo(18.502f, 9.172f, 18.839f, 9.506f, 19.253f, 9.505f)
            verticalLineTo(9.5f)
            lineTo(19.452f, 9.495f)
            curveTo(21.428f, 9.391f, 23f, 7.754f, 23f, 5.75f)
            close()
            moveTo(16.5f, 2.75f)
            curveTo(16.5f, 2.336f, 16.164f, 2f, 15.75f, 2f)
            lineTo(15.551f, 2.005f)
            curveTo(13.572f, 2.109f, 12f, 3.746f, 12f, 5.75f)
            curveTo(12f, 7.821f, 13.679f, 9.5f, 15.75f, 9.5f)
            lineTo(15.852f, 9.493f)
            curveTo(16.218f, 9.443f, 16.5f, 9.13f, 16.5f, 8.75f)
            curveTo(16.5f, 8.336f, 16.164f, 8f, 15.75f, 8f)
            lineTo(15.596f, 7.995f)
            curveTo(14.425f, 7.916f, 13.5f, 6.941f, 13.5f, 5.75f)
            curveTo(13.5f, 4.507f, 14.507f, 3.5f, 15.75f, 3.5f)
            lineTo(15.852f, 3.493f)
            curveTo(16.218f, 3.443f, 16.5f, 3.13f, 16.5f, 2.75f)
            close()
            moveTo(20f, 5.75f)
            curveTo(20f, 5.336f, 19.664f, 5f, 19.25f, 5f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 5.007f)
            curveTo(15.282f, 5.057f, 15f, 5.37f, 15f, 5.75f)
            curveTo(15f, 6.164f, 15.336f, 6.5f, 15.75f, 6.5f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 6.493f)
            curveTo(19.718f, 6.443f, 20f, 6.13f, 20f, 5.75f)
            close()
            moveTo(11f, 5.75f)
            curveTo(11f, 4.725f, 11.325f, 3.776f, 11.877f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineTo(6f)
            verticalLineTo(20.75f)
            curveTo(6f, 21.78f, 7.176f, 22.368f, 8f, 21.75f)
            lineTo(13f, 18f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
            verticalLineTo(9.623f)
            curveTo(21.224f, 10.175f, 20.275f, 10.5f, 19.25f, 10.5f)
            horizontalLineTo(15.75f)
            curveTo(13.127f, 10.5f, 11f, 8.373f, 11f, 5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CommentLink, contentDescription = null)
    }
}
