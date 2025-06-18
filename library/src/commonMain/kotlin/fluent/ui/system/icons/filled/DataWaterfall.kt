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

public val FluentUi.Filled.DataWaterfall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataWaterfall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.75f, 3f)
            curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
            curveTo(2f, 4.164f, 2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineTo(4f)
            verticalLineTo(10.25f)
            curveTo(4f, 11.493f, 5.007f, 12.5f, 6.25f, 12.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(18.75f)
            curveTo(12.5f, 19.993f, 13.507f, 21f, 14.75f, 21f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 21f, 22f, 20.664f, 22f, 20.25f)
            curveTo(22f, 19.836f, 21.664f, 19.5f, 21.25f, 19.5f)
            horizontalLineTo(20f)
            verticalLineTo(13.25f)
            curveTo(20f, 12.007f, 18.993f, 11f, 17.75f, 11f)
            horizontalLineTo(11.5f)
            verticalLineTo(5.25f)
            curveTo(11.5f, 4.007f, 10.493f, 3f, 9.25f, 3f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataWaterfallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataWaterfall, contentDescription = null)
    }
}
