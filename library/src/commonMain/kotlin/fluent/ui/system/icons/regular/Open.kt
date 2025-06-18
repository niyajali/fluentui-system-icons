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

public val FluentUi.Regular.Open: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Open",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 4.5f)
            curveTo(5.283f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.283f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(13.75f)
            curveTo(19.5f, 13.336f, 19.835f, 13f, 20.25f, 13f)
            curveTo(20.664f, 13f, 21f, 13.336f, 21f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            curveTo(11f, 4.164f, 10.664f, 4.5f, 10.25f, 4.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(13f, 3.75f)
            curveTo(13f, 3.336f, 13.335f, 3f, 13.75f, 3f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            verticalLineTo(10.25f)
            curveTo(21f, 10.664f, 20.664f, 11f, 20.25f, 11f)
            curveTo(19.836f, 11f, 19.5f, 10.664f, 19.5f, 10.25f)
            verticalLineTo(5.561f)
            lineTo(14.28f, 10.78f)
            curveTo(13.987f, 11.073f, 13.512f, 11.073f, 13.219f, 10.78f)
            curveTo(12.927f, 10.487f, 12.927f, 10.012f, 13.219f, 9.72f)
            lineTo(18.44f, 4.5f)
            horizontalLineTo(13.75f)
            curveTo(13.335f, 4.5f, 13f, 4.164f, 13f, 3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Open, contentDescription = null)
    }
}
