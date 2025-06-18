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

public val FluentUi.Regular.DataBarVerticalAscending: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataBarVerticalAscending",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.251f, 3f)
            curveTo(17.009f, 3f, 16.002f, 4.007f, 16.002f, 5.249f)
            verticalLineTo(18.751f)
            curveTo(16.002f, 19.993f, 17.009f, 21f, 18.251f, 21f)
            curveTo(19.493f, 21f, 20.5f, 19.993f, 20.5f, 18.751f)
            verticalLineTo(5.249f)
            curveTo(20.5f, 4.007f, 19.493f, 3f, 18.251f, 3f)
            close()
            moveTo(11.751f, 7f)
            curveTo(10.509f, 7f, 9.502f, 8.007f, 9.502f, 9.249f)
            verticalLineTo(18.751f)
            curveTo(9.502f, 19.993f, 10.509f, 21f, 11.751f, 21f)
            curveTo(12.993f, 21f, 14f, 19.993f, 14f, 18.751f)
            verticalLineTo(9.249f)
            curveTo(14f, 8.007f, 12.993f, 7f, 11.751f, 7f)
            close()
            moveTo(5.251f, 11f)
            curveTo(4.009f, 11f, 3.002f, 12.007f, 3.002f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(3.002f, 19.993f, 4.009f, 21f, 5.251f, 21f)
            curveTo(6.493f, 21f, 7.5f, 19.993f, 7.5f, 18.751f)
            verticalLineTo(13.249f)
            curveTo(7.5f, 12.007f, 6.493f, 11f, 5.251f, 11f)
            close()
            moveTo(18.251f, 4.5f)
            curveTo(18.665f, 4.5f, 19f, 4.835f, 19f, 5.249f)
            verticalLineTo(18.751f)
            curveTo(19f, 19.165f, 18.665f, 19.5f, 18.251f, 19.5f)
            curveTo(17.837f, 19.5f, 17.502f, 19.165f, 17.502f, 18.751f)
            verticalLineTo(5.249f)
            curveTo(17.502f, 4.835f, 17.837f, 4.5f, 18.251f, 4.5f)
            close()
            moveTo(11.751f, 8.5f)
            curveTo(12.165f, 8.5f, 12.5f, 8.835f, 12.5f, 9.249f)
            verticalLineTo(18.751f)
            curveTo(12.5f, 19.165f, 12.165f, 19.5f, 11.751f, 19.5f)
            curveTo(11.337f, 19.5f, 11.002f, 19.165f, 11.002f, 18.751f)
            verticalLineTo(9.249f)
            curveTo(11.002f, 8.835f, 11.337f, 8.5f, 11.751f, 8.5f)
            close()
            moveTo(5.251f, 12.5f)
            curveTo(5.665f, 12.5f, 6f, 12.835f, 6f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(6f, 19.165f, 5.665f, 19.5f, 5.251f, 19.5f)
            curveTo(4.837f, 19.5f, 4.502f, 19.165f, 4.502f, 18.751f)
            verticalLineTo(13.249f)
            curveTo(4.502f, 12.835f, 4.837f, 12.5f, 5.251f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataBarVerticalAscendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataBarVerticalAscending, contentDescription = null)
    }
}
