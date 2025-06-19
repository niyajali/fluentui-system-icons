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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Showerhead: ImageVector
    get() {
        if (_Showerhead != null) {
            return _Showerhead!!
        }
        _Showerhead = ImageVector.Builder(
            name = "Regular.Showerhead",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.605f, 4.856f)
                lineTo(17.729f, 2.731f)
                curveTo(18.704f, 1.756f, 20.285f, 1.756f, 21.26f, 2.731f)
                curveTo(22.235f, 3.706f, 22.235f, 5.287f, 21.26f, 6.262f)
                lineTo(19.138f, 8.384f)
                curveTo(20.602f, 11.271f, 20.201f, 14.861f, 17.936f, 17.364f)
                curveTo(18.154f, 18.194f, 17.937f, 19.115f, 17.286f, 19.765f)
                curveTo(16.311f, 20.74f, 14.731f, 20.74f, 13.755f, 19.765f)
                lineTo(4.266f, 10.276f)
                curveTo(3.291f, 9.301f, 3.291f, 7.72f, 4.266f, 6.745f)
                curveTo(4.903f, 6.107f, 5.799f, 5.887f, 6.616f, 6.083f)
                curveTo(9.116f, 3.804f, 12.711f, 3.395f, 15.605f, 4.856f)
                close()
                moveTo(18.314f, 7.087f)
                lineTo(20.199f, 5.202f)
                curveTo(20.589f, 4.812f, 20.589f, 4.181f, 20.199f, 3.792f)
                curveTo(19.81f, 3.403f, 19.179f, 3.403f, 18.79f, 3.792f)
                lineTo(16.904f, 5.678f)
                curveTo(17.165f, 5.881f, 17.417f, 6.103f, 17.657f, 6.343f)
                curveTo(17.894f, 6.58f, 18.113f, 6.829f, 18.314f, 7.087f)
                close()
                moveTo(5.326f, 7.806f)
                curveTo(4.937f, 8.195f, 4.937f, 8.826f, 5.326f, 9.215f)
                lineTo(14.816f, 18.705f)
                curveTo(15.205f, 19.094f, 15.837f, 19.094f, 16.226f, 18.705f)
                curveTo(16.615f, 18.316f, 16.615f, 17.684f, 16.226f, 17.295f)
                lineTo(6.736f, 7.806f)
                curveTo(6.347f, 7.416f, 5.716f, 7.416f, 5.326f, 7.806f)
                close()
                moveTo(7.78f, 17.28f)
                curveTo(8.073f, 16.987f, 8.073f, 16.513f, 7.78f, 16.22f)
                curveTo(7.487f, 15.927f, 7.013f, 15.927f, 6.72f, 16.22f)
                lineTo(4.72f, 18.22f)
                curveTo(4.427f, 18.513f, 4.427f, 18.987f, 4.72f, 19.28f)
                curveTo(5.013f, 19.573f, 5.487f, 19.573f, 5.78f, 19.28f)
                lineTo(7.78f, 17.28f)
                close()
                moveTo(10.28f, 18.72f)
                curveTo(10.573f, 19.013f, 10.573f, 19.487f, 10.28f, 19.78f)
                lineTo(8.28f, 21.78f)
                curveTo(7.987f, 22.073f, 7.513f, 22.073f, 7.22f, 21.78f)
                curveTo(6.927f, 21.487f, 6.927f, 21.013f, 7.22f, 20.72f)
                lineTo(9.22f, 18.72f)
                curveTo(9.513f, 18.427f, 9.987f, 18.427f, 10.28f, 18.72f)
                close()
                moveTo(5.28f, 14.78f)
                curveTo(5.573f, 14.487f, 5.573f, 14.013f, 5.28f, 13.72f)
                curveTo(4.987f, 13.427f, 4.513f, 13.427f, 4.22f, 13.72f)
                lineTo(2.22f, 15.72f)
                curveTo(1.927f, 16.013f, 1.927f, 16.487f, 2.22f, 16.78f)
                curveTo(2.513f, 17.073f, 2.987f, 17.073f, 3.28f, 16.78f)
                lineTo(5.28f, 14.78f)
                close()
                moveTo(17.096f, 16.036f)
                curveTo(19.122f, 13.484f, 18.955f, 9.763f, 16.596f, 7.404f)
                curveTo(14.237f, 5.045f, 10.516f, 4.878f, 7.964f, 6.904f)
                lineTo(17.096f, 16.036f)
                close()
            }
        }.build()

        return _Showerhead!!
    }

@Suppress("ObjectPropertyName")
private var _Showerhead: ImageVector? = null

@Preview
@Composable
private fun ShowerheadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Showerhead, contentDescription = null)
    }
}
