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

public val FluentUi.Filled.ResizeSmall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ResizeSmall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7.75f)
            curveTo(4.5f, 8.164f, 4.164f, 8.5f, 3.75f, 8.5f)
            curveTo(3.336f, 8.5f, 3f, 8.164f, 3f, 7.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(7.75f)
            curveTo(8.164f, 3f, 8.5f, 3.336f, 8.5f, 3.75f)
            curveTo(8.5f, 4.164f, 8.164f, 4.5f, 7.75f, 4.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(10.2f, 8f)
            curveTo(8.957f, 8f, 7.95f, 9.007f, 7.95f, 10.25f)
            verticalLineTo(13.75f)
            curveTo(7.95f, 14.993f, 8.957f, 16f, 10.2f, 16f)
            horizontalLineTo(13.7f)
            curveTo(14.943f, 16f, 15.95f, 14.993f, 15.95f, 13.75f)
            verticalLineTo(10.25f)
            curveTo(15.95f, 9.007f, 14.943f, 8f, 13.7f, 8f)
            horizontalLineTo(10.2f)
            close()
            moveTo(17.75f, 4.5f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(7.75f)
            curveTo(19.5f, 8.164f, 19.836f, 8.5f, 20.25f, 8.5f)
            curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 3f, 15.5f, 3.336f, 15.5f, 3.75f)
            curveTo(15.5f, 4.164f, 15.836f, 4.5f, 16.25f, 4.5f)
            lineTo(17.75f, 4.5f)
            close()
            moveTo(17.75f, 19.5f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(16.25f)
            curveTo(19.5f, 15.836f, 19.836f, 15.5f, 20.25f, 15.5f)
            curveTo(20.664f, 15.5f, 21f, 15.836f, 21f, 16.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 21f, 15.5f, 20.664f, 15.5f, 20.25f)
            curveTo(15.5f, 19.836f, 15.836f, 19.5f, 16.25f, 19.5f)
            horizontalLineTo(17.75f)
            close()
            moveTo(6.25f, 19.5f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            lineTo(4.5f, 16.25f)
            curveTo(4.5f, 15.836f, 4.164f, 15.5f, 3.75f, 15.5f)
            curveTo(3.336f, 15.5f, 3f, 15.836f, 3f, 16.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(7.75f)
            curveTo(8.164f, 21f, 8.5f, 20.664f, 8.5f, 20.25f)
            curveTo(8.5f, 19.836f, 8.164f, 19.5f, 7.75f, 19.5f)
            horizontalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ResizeSmallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ResizeSmall, contentDescription = null)
    }
}
