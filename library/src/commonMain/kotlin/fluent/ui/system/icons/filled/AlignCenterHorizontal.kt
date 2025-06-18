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

public val FluentUi.Filled.AlignCenterHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 12.75f)
            curveTo(21.664f, 12.75f, 22f, 12.414f, 22f, 12f)
            curveTo(22f, 11.586f, 21.664f, 11.25f, 21.25f, 11.25f)
            horizontalLineTo(20f)
            verticalLineTo(8.75f)
            curveTo(20f, 7.507f, 18.993f, 6.5f, 17.75f, 6.5f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 6.5f, 13f, 7.507f, 13f, 8.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(11f)
            verticalLineTo(6.75f)
            curveTo(11f, 5.507f, 9.993f, 4.5f, 8.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 4.5f, 4f, 5.507f, 4f, 6.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.25f, 2f, 11.586f, 2f, 12f)
            curveTo(2f, 12.414f, 2.336f, 12.75f, 2.75f, 12.75f)
            horizontalLineTo(4f)
            verticalLineTo(17.25f)
            curveTo(4f, 18.493f, 5.007f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(8.75f)
            curveTo(9.993f, 19.5f, 11f, 18.493f, 11f, 17.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(13f)
            verticalLineTo(15.25f)
            curveTo(13f, 16.493f, 14.007f, 17.5f, 15.25f, 17.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 17.5f, 20f, 16.493f, 20f, 15.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(21.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignCenterHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AlignCenterHorizontal, contentDescription = null)
    }
}
