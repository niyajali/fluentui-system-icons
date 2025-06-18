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

public val FluentUi.Regular.MicRecord: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MicRecord",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 17.5f)
            curveTo(11f, 18.596f, 11.271f, 19.629f, 11.75f, 20.535f)
            lineTo(11.75f, 21.25f)
            curveTo(11.75f, 21.664f, 11.414f, 22f, 11f, 22f)
            curveTo(10.62f, 22f, 10.307f, 21.718f, 10.257f, 21.352f)
            lineTo(10.25f, 21.25f)
            lineTo(10.25f, 18.982f)
            curveTo(6.833f, 18.732f, 4.123f, 15.938f, 4.004f, 12.486f)
            lineTo(4f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
            curveTo(5.13f, 11f, 5.443f, 11.282f, 5.493f, 11.648f)
            lineTo(5.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(5.5f, 15.077f, 7.734f, 17.382f, 10.534f, 17.496f)
            lineTo(10.75f, 17.5f)
            horizontalLineTo(11f)
            close()
            moveTo(15f, 6f)
            verticalLineTo(11.498f)
            curveTo(14.446f, 11.729f, 13.932f, 12.034f, 13.468f, 12.401f)
            curveTo(13.489f, 12.271f, 13.5f, 12.137f, 13.5f, 12f)
            verticalLineTo(6f)
            curveTo(13.5f, 4.619f, 12.381f, 3.5f, 11f, 3.5f)
            curveTo(9.619f, 3.5f, 8.5f, 4.619f, 8.5f, 6f)
            verticalLineTo(12f)
            curveTo(8.5f, 13.381f, 9.619f, 14.5f, 11f, 14.5f)
            curveTo(11.281f, 14.5f, 11.551f, 14.454f, 11.803f, 14.368f)
            curveTo(11.524f, 14.874f, 11.311f, 15.42f, 11.175f, 15.996f)
            curveTo(11.117f, 15.999f, 11.059f, 16f, 11f, 16f)
            curveTo(8.791f, 16f, 7f, 14.209f, 7f, 12f)
            verticalLineTo(6f)
            curveTo(7f, 3.791f, 8.791f, 2f, 11f, 2f)
            curveTo(13.209f, 2f, 15f, 3.791f, 15f, 6f)
            close()
            moveTo(20f, 17.5f)
            curveTo(20f, 18.881f, 18.881f, 20f, 17.5f, 20f)
            curveTo(16.119f, 20f, 15f, 18.881f, 15f, 17.5f)
            curveTo(15f, 16.119f, 16.119f, 15f, 17.5f, 15f)
            curveTo(18.881f, 15f, 20f, 16.119f, 20f, 17.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(13.5f, 17.5f)
            curveTo(13.5f, 19.709f, 15.291f, 21.5f, 17.5f, 21.5f)
            curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
            curveTo(21.5f, 15.291f, 19.709f, 13.5f, 17.5f, 13.5f)
            curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicRecordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MicRecord, contentDescription = null)
    }
}
