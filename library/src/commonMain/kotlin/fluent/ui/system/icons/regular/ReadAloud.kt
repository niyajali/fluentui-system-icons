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

public val FluentIcons.Regular.ReadAloud: ImageVector
    get() {
        if (_ReadAloud != null) {
            return _ReadAloud!!
        }
        _ReadAloud = ImageVector.Builder(
            name = "Regular.ReadAloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.861f, 2.092f)
                curveTo(15.498f, 1.893f, 15.042f, 2.027f, 14.844f, 2.391f)
                curveTo(14.645f, 2.754f, 14.779f, 3.21f, 15.142f, 3.408f)
                curveTo(16.996f, 4.421f, 18.358f, 5.694f, 19.244f, 7.229f)
                curveTo(20.131f, 8.765f, 20.552f, 10.581f, 20.502f, 12.693f)
                curveTo(20.492f, 13.107f, 20.82f, 13.45f, 21.234f, 13.46f)
                curveTo(21.648f, 13.47f, 21.992f, 13.142f, 22.002f, 12.728f)
                curveTo(22.058f, 10.352f, 21.573f, 8.264f, 20.543f, 6.479f)
                curveTo(19.513f, 4.695f, 17.947f, 3.232f, 15.861f, 2.092f)
                close()
                moveTo(15.624f, 5.693f)
                curveTo(15.26f, 5.495f, 14.805f, 5.629f, 14.606f, 5.992f)
                curveTo(14.408f, 6.356f, 14.542f, 6.812f, 14.906f, 7.01f)
                curveTo(15.627f, 7.403f, 16.203f, 7.973f, 16.641f, 8.732f)
                curveTo(17.079f, 9.492f, 17.285f, 10.275f, 17.265f, 11.097f)
                curveTo(17.255f, 11.511f, 17.582f, 11.855f, 17.997f, 11.865f)
                curveTo(18.411f, 11.875f, 18.754f, 11.547f, 18.765f, 11.133f)
                curveTo(18.791f, 10.032f, 18.514f, 8.977f, 17.94f, 7.982f)
                curveTo(17.366f, 6.988f, 16.591f, 6.22f, 15.624f, 5.693f)
                close()
                moveTo(9f, 3.999f)
                curveTo(9.308f, 3.999f, 9.584f, 4.186f, 9.697f, 4.472f)
                lineTo(15.447f, 18.973f)
                curveTo(15.6f, 19.358f, 15.412f, 19.794f, 15.027f, 19.947f)
                curveTo(14.642f, 20.1f, 14.206f, 19.911f, 14.053f, 19.526f)
                lineTo(12.258f, 14.999f)
                horizontalLineTo(5.742f)
                lineTo(3.947f, 19.526f)
                curveTo(3.795f, 19.911f, 3.359f, 20.1f, 2.974f, 19.947f)
                curveTo(2.589f, 19.794f, 2.4f, 19.358f, 2.553f, 18.973f)
                lineTo(8.303f, 4.472f)
                curveTo(8.416f, 4.186f, 8.693f, 3.999f, 9f, 3.999f)
                close()
                moveTo(9f, 6.783f)
                lineTo(6.337f, 13.499f)
                horizontalLineTo(11.663f)
                lineTo(9f, 6.783f)
                close()
            }
        }.build()

        return _ReadAloud!!
    }

@Suppress("ObjectPropertyName")
private var _ReadAloud: ImageVector? = null

@Preview
@Composable
private fun ReadAloudPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ReadAloud, contentDescription = null)
    }
}
