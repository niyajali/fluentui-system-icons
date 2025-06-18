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

public val FluentUi.Regular.ClockAlarm: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClockAlarm",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 7.75f)
            curveTo(12f, 7.336f, 11.664f, 7f, 11.25f, 7f)
            curveTo(10.836f, 7f, 10.5f, 7.336f, 10.5f, 7.75f)
            verticalLineTo(12.75f)
            curveTo(10.5f, 13.164f, 10.836f, 13.5f, 11.25f, 13.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 13.5f, 15.5f, 13.164f, 15.5f, 12.75f)
            curveTo(15.5f, 12.336f, 15.164f, 12f, 14.75f, 12f)
            horizontalLineTo(12f)
            verticalLineTo(7.75f)
            close()
            moveTo(3.476f, 9.103f)
            curveTo(2.576f, 8.371f, 2f, 7.253f, 2f, 6f)
            curveTo(2f, 3.791f, 3.791f, 2f, 6f, 2f)
            curveTo(7.253f, 2f, 8.371f, 2.576f, 9.103f, 3.476f)
            curveTo(10.012f, 3.167f, 10.987f, 3f, 12f, 3f)
            curveTo(13.013f, 3f, 13.988f, 3.167f, 14.897f, 3.476f)
            curveTo(15.629f, 2.576f, 16.747f, 2f, 18f, 2f)
            curveTo(20.209f, 2f, 22f, 3.791f, 22f, 6f)
            curveTo(22f, 7.253f, 21.424f, 8.371f, 20.524f, 9.103f)
            curveTo(20.833f, 10.012f, 21f, 10.987f, 21f, 12f)
            curveTo(21f, 14.215f, 20.2f, 16.244f, 18.872f, 17.812f)
            lineTo(20.78f, 19.72f)
            curveTo(21.073f, 20.013f, 21.073f, 20.487f, 20.78f, 20.78f)
            curveTo(20.487f, 21.073f, 20.013f, 21.073f, 19.72f, 20.78f)
            lineTo(17.812f, 18.872f)
            curveTo(16.244f, 20.2f, 14.215f, 21f, 12f, 21f)
            curveTo(9.785f, 21f, 7.756f, 20.2f, 6.188f, 18.872f)
            lineTo(4.28f, 20.78f)
            curveTo(3.987f, 21.073f, 3.513f, 21.073f, 3.22f, 20.78f)
            curveTo(2.927f, 20.487f, 2.927f, 20.013f, 3.22f, 19.72f)
            lineTo(5.128f, 17.812f)
            curveTo(3.8f, 16.244f, 3f, 14.215f, 3f, 12f)
            curveTo(3f, 10.987f, 3.167f, 10.012f, 3.476f, 9.103f)
            close()
            moveTo(3.5f, 6f)
            curveTo(3.5f, 6.631f, 3.734f, 7.208f, 4.12f, 7.648f)
            curveTo(4.94f, 6.166f, 6.166f, 4.94f, 7.648f, 4.12f)
            curveTo(7.208f, 3.734f, 6.631f, 3.5f, 6f, 3.5f)
            curveTo(4.619f, 3.5f, 3.5f, 4.619f, 3.5f, 6f)
            close()
            moveTo(19.88f, 7.648f)
            curveTo(20.267f, 7.208f, 20.5f, 6.631f, 20.5f, 6f)
            curveTo(20.5f, 4.619f, 19.381f, 3.5f, 18f, 3.5f)
            curveTo(17.369f, 3.5f, 16.792f, 3.734f, 16.352f, 4.12f)
            curveTo(17.834f, 4.94f, 19.06f, 6.166f, 19.88f, 7.648f)
            close()
            moveTo(4.5f, 12f)
            curveTo(4.5f, 16.142f, 7.858f, 19.5f, 12f, 19.5f)
            curveTo(16.142f, 19.5f, 19.5f, 16.142f, 19.5f, 12f)
            curveTo(19.5f, 7.858f, 16.142f, 4.5f, 12f, 4.5f)
            curveTo(7.858f, 4.5f, 4.5f, 7.858f, 4.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockAlarmPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ClockAlarm, contentDescription = null)
    }
}
