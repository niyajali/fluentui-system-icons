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

public val FluentUi.Filled.AlignLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 2.75f)
            curveTo(3f, 2.336f, 3.336f, 2f, 3.75f, 2f)
            curveTo(4.164f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(4.5f, 21.664f, 4.164f, 22f, 3.75f, 22f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(8.25f, 4f)
            curveTo(7.007f, 4f, 6f, 5.007f, 6f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(6f, 9.993f, 7.007f, 11f, 8.25f, 11f)
            lineTo(18.75f, 11f)
            curveTo(19.993f, 11f, 21f, 9.993f, 21f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 5.007f, 19.993f, 4f, 18.75f, 4f)
            lineTo(8.25f, 4f)
            close()
            moveTo(8.25f, 13f)
            curveTo(7.007f, 13f, 6f, 14.007f, 6f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(6f, 18.993f, 7.007f, 20f, 8.25f, 20f)
            horizontalLineTo(15.25f)
            curveTo(16.493f, 20f, 17.5f, 18.993f, 17.5f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(17.5f, 14.007f, 16.493f, 13f, 15.25f, 13f)
            lineTo(8.25f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AlignLeft, contentDescription = null)
    }
}
