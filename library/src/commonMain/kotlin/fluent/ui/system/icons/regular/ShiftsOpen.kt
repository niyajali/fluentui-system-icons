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

public val FluentUi.Regular.ShiftsOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShiftsOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 4.5f, 10f, 4.164f, 10f, 3.75f)
            curveTo(10f, 3.336f, 9.664f, 3f, 9.25f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 21f, 10f, 20.664f, 10f, 20.25f)
            curveTo(10f, 19.836f, 9.664f, 19.5f, 9.25f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(14.747f, 3f)
            curveTo(14.333f, 3f, 13.997f, 3.336f, 13.997f, 3.75f)
            curveTo(13.997f, 4.164f, 14.333f, 4.5f, 14.747f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(14.747f)
            curveTo(14.333f, 19.5f, 13.997f, 19.836f, 13.997f, 20.25f)
            curveTo(13.997f, 20.664f, 14.333f, 21f, 14.747f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(14.747f)
            close()
            moveTo(12.5f, 6.75f)
            curveTo(12.5f, 6.336f, 12.164f, 6f, 11.75f, 6f)
            curveTo(11.336f, 6f, 11f, 6.336f, 11f, 6.75f)
            verticalLineTo(12.75f)
            curveTo(11f, 13.164f, 11.336f, 13.5f, 11.75f, 13.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 13.5f, 17f, 13.164f, 17f, 12.75f)
            curveTo(17f, 12.336f, 16.664f, 12f, 16.25f, 12f)
            horizontalLineTo(12.5f)
            verticalLineTo(6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShiftsOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShiftsOpen, contentDescription = null)
    }
}
