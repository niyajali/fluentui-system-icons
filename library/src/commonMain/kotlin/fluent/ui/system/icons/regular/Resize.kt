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

public val FluentUi.Regular.Resize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Resize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8.25f)
            curveTo(3f, 8.664f, 3.336f, 9f, 3.75f, 9f)
            curveTo(4.164f, 9f, 4.5f, 8.664f, 4.5f, 8.25f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 4.5f, 11f, 4.164f, 11f, 3.75f)
            curveTo(11f, 3.336f, 10.664f, 3f, 10.25f, 3f)
            close()
            moveTo(4.5f, 17.75f)
            verticalLineTo(13.25f)
            curveTo(4.5f, 12.283f, 5.284f, 11.5f, 6.25f, 11.5f)
            horizontalLineTo(10.75f)
            curveTo(11.717f, 11.5f, 12.5f, 12.283f, 12.5f, 13.25f)
            verticalLineTo(17.75f)
            curveTo(12.5f, 18.716f, 11.717f, 19.5f, 10.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            close()
            moveTo(10.75f, 21f)
            curveTo(12.545f, 21f, 14f, 19.545f, 14f, 17.75f)
            verticalLineTo(13.25f)
            curveTo(14f, 11.455f, 12.545f, 10f, 10.75f, 10f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 10f, 3f, 11.455f, 3f, 13.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(10.75f)
            close()
            moveTo(15.75f, 21f)
            curveTo(15.336f, 21f, 15f, 20.664f, 15f, 20.25f)
            curveTo(15f, 19.836f, 15.336f, 19.5f, 15.75f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(13.75f)
            curveTo(19.5f, 13.336f, 19.836f, 13f, 20.25f, 13f)
            curveTo(20.664f, 13f, 21f, 13.336f, 21f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(15.75f)
            close()
            moveTo(21f, 10.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 3f, 13f, 3.336f, 13f, 3.75f)
            curveTo(13f, 4.164f, 13.336f, 4.5f, 13.75f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(10.25f)
            curveTo(19.5f, 10.664f, 19.836f, 11f, 20.25f, 11f)
            curveTo(20.664f, 11f, 21f, 10.664f, 21f, 10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ResizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Resize, contentDescription = null)
    }
}
