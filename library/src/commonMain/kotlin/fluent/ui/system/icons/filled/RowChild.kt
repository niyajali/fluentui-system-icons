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

public val FluentUi.Filled.RowChild: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RowChild",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3f)
            curveTo(4.007f, 3f, 3f, 4.007f, 3f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(3f, 9.493f, 4.007f, 10.5f, 5.25f, 10.5f)
            horizontalLineTo(6f)
            verticalLineTo(14.75f)
            curveTo(6f, 16.545f, 7.455f, 18f, 9.25f, 18f)
            horizontalLineTo(12f)
            verticalLineTo(18.75f)
            curveTo(12f, 19.993f, 13.007f, 21f, 14.25f, 21f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 21f, 21f, 19.993f, 21f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(21f, 14.507f, 19.993f, 13.5f, 18.75f, 13.5f)
            horizontalLineTo(14.25f)
            curveTo(13.007f, 13.5f, 12f, 14.507f, 12f, 15.75f)
            verticalLineTo(16.5f)
            horizontalLineTo(9.25f)
            curveTo(8.283f, 16.5f, 7.5f, 15.717f, 7.5f, 14.75f)
            verticalLineTo(10.5f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 10.5f, 21f, 9.493f, 21f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(21f, 4.007f, 19.993f, 3f, 18.75f, 3f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RowChildPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RowChild, contentDescription = null)
    }
}
