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

public val FluentUi.Regular.FilmstripPlay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FilmstripPlay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 7.25f)
            curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(18.25f, 7f)
            curveTo(17.836f, 7f, 17.5f, 7.336f, 17.5f, 7.75f)
            verticalLineTo(8.25f)
            curveTo(17.5f, 8.664f, 17.836f, 9f, 18.25f, 9f)
            curveTo(18.664f, 9f, 19f, 8.664f, 19f, 8.25f)
            verticalLineTo(7.75f)
            curveTo(19f, 7.336f, 18.664f, 7f, 18.25f, 7f)
            close()
            moveTo(17.5f, 15.75f)
            curveTo(17.5f, 15.336f, 17.836f, 15f, 18.25f, 15f)
            curveTo(18.664f, 15f, 19f, 15.336f, 19f, 15.75f)
            verticalLineTo(16.25f)
            curveTo(19f, 16.664f, 18.664f, 17f, 18.25f, 17f)
            curveTo(17.836f, 17f, 17.5f, 16.664f, 17.5f, 16.25f)
            verticalLineTo(15.75f)
            close()
            moveTo(18.25f, 11f)
            curveTo(17.836f, 11f, 17.5f, 11.336f, 17.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(17.5f, 12.664f, 17.836f, 13f, 18.25f, 13f)
            curveTo(18.664f, 13f, 19f, 12.664f, 19f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(19f, 11.336f, 18.664f, 11f, 18.25f, 11f)
            close()
            moveTo(5f, 7.75f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            curveTo(6.164f, 7f, 6.5f, 7.336f, 6.5f, 7.75f)
            verticalLineTo(8.25f)
            curveTo(6.5f, 8.664f, 6.164f, 9f, 5.75f, 9f)
            curveTo(5.336f, 9f, 5f, 8.664f, 5f, 8.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(5.75f, 15f)
            curveTo(5.336f, 15f, 5f, 15.336f, 5f, 15.75f)
            verticalLineTo(16.25f)
            curveTo(5f, 16.664f, 5.336f, 17f, 5.75f, 17f)
            curveTo(6.164f, 17f, 6.5f, 16.664f, 6.5f, 16.25f)
            verticalLineTo(15.75f)
            curveTo(6.5f, 15.336f, 6.164f, 15f, 5.75f, 15f)
            close()
            moveTo(5f, 11.75f)
            curveTo(5f, 11.336f, 5.336f, 11f, 5.75f, 11f)
            curveTo(6.164f, 11f, 6.5f, 11.336f, 6.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(6.5f, 12.664f, 6.164f, 13f, 5.75f, 13f)
            curveTo(5.336f, 13f, 5f, 12.664f, 5f, 12.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(10f, 9.751f)
            curveTo(10f, 9.172f, 10.576f, 8.811f, 11.035f, 9.104f)
            lineTo(14.709f, 11.447f)
            curveTo(15.097f, 11.694f, 15.097f, 12.306f, 14.709f, 12.553f)
            lineTo(11.034f, 14.896f)
            curveTo(10.576f, 15.189f, 10f, 14.828f, 10f, 14.249f)
            verticalLineTo(9.751f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilmstripPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FilmstripPlay, contentDescription = null)
    }
}
