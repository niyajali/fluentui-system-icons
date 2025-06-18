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

public val FluentUi.Filled.ContractUpRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContractUpRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 21f, 13f, 20.664f, 13f, 20.25f)
            curveTo(13f, 19.836f, 13.336f, 19.5f, 13.75f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(12f)
            horizontalLineTo(14.25f)
            curveTo(13.007f, 12f, 12f, 10.993f, 12f, 9.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(10.25f)
            curveTo(4.5f, 10.664f, 4.164f, 11f, 3.75f, 11f)
            curveTo(3.336f, 11f, 3f, 10.664f, 3f, 10.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(3.75f, 14.5f)
            curveTo(3.336f, 14.5f, 3f, 14.164f, 3f, 13.75f)
            curveTo(3f, 13.336f, 3.336f, 13f, 3.75f, 13f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 13f, 11f, 13.336f, 11f, 13.75f)
            verticalLineTo(20.25f)
            curveTo(11f, 20.664f, 10.664f, 21f, 10.25f, 21f)
            curveTo(9.836f, 21f, 9.5f, 20.664f, 9.5f, 20.25f)
            verticalLineTo(15.561f)
            lineTo(4.28f, 20.78f)
            curveTo(3.987f, 21.073f, 3.513f, 21.073f, 3.22f, 20.78f)
            curveTo(2.927f, 20.487f, 2.927f, 20.013f, 3.22f, 19.72f)
            lineTo(8.439f, 14.5f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContractUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ContractUpRight, contentDescription = null)
    }
}
