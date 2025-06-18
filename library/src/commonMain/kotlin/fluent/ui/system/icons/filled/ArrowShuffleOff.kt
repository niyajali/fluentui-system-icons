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

public val FluentUi.Filled.ArrowShuffleOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowShuffleOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(5.924f, 6.985f)
            curveTo(5.047f, 6.68f, 4.08f, 6.5f, 3f, 6.5f)
            curveTo(2.448f, 6.5f, 2f, 6.948f, 2f, 7.5f)
            curveTo(2f, 8.053f, 2.448f, 8.5f, 3f, 8.5f)
            curveTo(5.475f, 8.5f, 7.185f, 9.68f, 8.886f, 11.299f)
            curveTo(9.104f, 11.08f, 9.327f, 10.852f, 9.556f, 10.616f)
            lineTo(10.263f, 11.324f)
            curveTo(8.045f, 13.604f, 6.137f, 15.5f, 3f, 15.5f)
            curveTo(2.448f, 15.5f, 2f, 15.948f, 2f, 16.5f)
            curveTo(2f, 17.052f, 2.448f, 17.5f, 3f, 17.5f)
            curveTo(7.049f, 17.5f, 9.503f, 14.975f, 11.632f, 12.785f)
            lineTo(11.677f, 12.738f)
            lineTo(12.384f, 13.445f)
            lineTo(12.287f, 13.545f)
            curveTo(12.101f, 13.737f, 11.91f, 13.934f, 11.713f, 14.134f)
            curveTo(12.895f, 15.263f, 14.229f, 16.328f, 15.886f, 16.947f)
            lineTo(17.57f, 18.631f)
            curveTo(17.428f, 18.991f, 17.502f, 19.416f, 17.793f, 19.707f)
            curveTo(18.084f, 19.998f, 18.509f, 20.072f, 18.869f, 19.93f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(17.584f, 14.402f)
            lineTo(21.048f, 17.866f)
            lineTo(21.707f, 17.207f)
            curveTo(21.895f, 17.02f, 22f, 16.765f, 22f, 16.5f)
            curveTo(22f, 16.235f, 21.895f, 15.98f, 21.707f, 15.793f)
            lineTo(19.207f, 13.293f)
            curveTo(18.817f, 12.902f, 18.183f, 12.902f, 17.793f, 13.293f)
            curveTo(17.493f, 13.593f, 17.423f, 14.036f, 17.584f, 14.402f)
            close()
            moveTo(12.41f, 9.228f)
            lineTo(13.83f, 10.648f)
            curveTo(15.207f, 9.46f, 16.659f, 8.62f, 18.574f, 8.512f)
            lineTo(17.793f, 9.293f)
            curveTo(17.402f, 9.683f, 17.402f, 10.317f, 17.793f, 10.707f)
            curveTo(18.183f, 11.098f, 18.817f, 11.098f, 19.207f, 10.707f)
            lineTo(21.707f, 8.207f)
            curveTo(21.895f, 8.02f, 22f, 7.765f, 22f, 7.5f)
            curveTo(22f, 7.235f, 21.895f, 6.98f, 21.707f, 6.793f)
            lineTo(19.207f, 4.293f)
            curveTo(18.817f, 3.902f, 18.183f, 3.902f, 17.793f, 4.293f)
            curveTo(17.402f, 4.683f, 17.402f, 5.317f, 17.793f, 5.707f)
            lineTo(18.594f, 6.509f)
            curveTo(15.97f, 6.62f, 14.033f, 7.808f, 12.41f, 9.228f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowShuffleOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowShuffleOff, contentDescription = null)
    }
}
