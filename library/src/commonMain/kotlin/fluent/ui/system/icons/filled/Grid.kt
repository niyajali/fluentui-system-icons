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

public val FluentUi.Filled.Grid: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Grid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 13f)
            curveTo(9.993f, 13f, 11f, 14.007f, 11f, 15.25f)
            verticalLineTo(18.75f)
            curveTo(11f, 19.993f, 9.993f, 21f, 8.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(15.25f)
            curveTo(3f, 14.007f, 4.007f, 13f, 5.25f, 13f)
            horizontalLineTo(8.75f)
            close()
            moveTo(18.75f, 13f)
            curveTo(19.993f, 13f, 21f, 14.007f, 21f, 15.25f)
            verticalLineTo(18.75f)
            curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 21f, 13f, 19.993f, 13f, 18.75f)
            verticalLineTo(15.25f)
            curveTo(13f, 14.007f, 14.007f, 13f, 15.25f, 13f)
            horizontalLineTo(18.75f)
            close()
            moveTo(8.75f, 3f)
            curveTo(9.993f, 3f, 11f, 4.007f, 11f, 5.25f)
            verticalLineTo(8.75f)
            curveTo(11f, 9.993f, 9.993f, 11f, 8.75f, 11f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 11f, 3f, 9.993f, 3f, 8.75f)
            verticalLineTo(5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(8.75f)
            close()
            moveTo(18.75f, 3f)
            curveTo(19.993f, 3f, 21f, 4.007f, 21f, 5.25f)
            verticalLineTo(8.75f)
            curveTo(21f, 9.993f, 19.993f, 11f, 18.75f, 11f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 11f, 13f, 9.993f, 13f, 8.75f)
            verticalLineTo(5.25f)
            curveTo(13f, 4.007f, 14.007f, 3f, 15.25f, 3f)
            horizontalLineTo(18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GridPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Grid, contentDescription = null)
    }
}
