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

public val FluentIcons.Regular.MoviesAndTv: ImageVector
    get() {
        if (_MoviesAndTv != null) {
            return _MoviesAndTv!!
        }
        _MoviesAndTv = ImageVector.Builder(
            name = "Regular.MoviesAndTv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.729f, 3.917f)
                lineTo(19.78f, 4.077f)
                lineTo(20.331f, 5.999f)
                curveTo(20.436f, 6.364f, 20.251f, 6.744f, 19.913f, 6.892f)
                lineTo(19.817f, 6.927f)
                lineTo(9.09f, 10.002f)
                lineTo(20.249f, 10.003f)
                curveTo(20.629f, 10.003f, 20.943f, 10.285f, 20.992f, 10.651f)
                lineTo(20.999f, 10.753f)
                verticalLineTo(19.251f)
                curveTo(20.999f, 20.713f, 19.858f, 21.909f, 18.417f, 21.996f)
                lineTo(18.249f, 22.001f)
                horizontalLineTo(5.75f)
                curveTo(4.288f, 22.001f, 3.092f, 20.859f, 3.005f, 19.419f)
                lineTo(3f, 19.251f)
                lineTo(3f, 10.859f)
                lineTo(2.478f, 9.038f)
                curveTo(2.075f, 7.632f, 2.843f, 6.168f, 4.204f, 5.687f)
                lineTo(4.364f, 5.636f)
                lineTo(16.378f, 2.191f)
                curveTo(17.784f, 1.788f, 19.249f, 2.556f, 19.729f, 3.917f)
                close()
                moveTo(19.498f, 11.502f)
                horizontalLineTo(4.5f)
                verticalLineTo(19.251f)
                curveTo(4.5f, 19.855f, 4.929f, 20.359f, 5.498f, 20.476f)
                lineTo(5.622f, 20.494f)
                lineTo(5.75f, 20.501f)
                horizontalLineTo(18.249f)
                curveTo(18.896f, 20.501f, 19.429f, 20.009f, 19.493f, 19.379f)
                lineTo(19.499f, 19.251f)
                lineTo(19.498f, 11.502f)
                close()
                moveTo(6.273f, 6.649f)
                lineTo(4.777f, 7.078f)
                curveTo(4.155f, 7.257f, 3.779f, 7.876f, 3.891f, 8.5f)
                lineTo(3.92f, 8.624f)
                lineTo(4.265f, 9.825f)
                lineTo(4.56f, 9.74f)
                lineTo(6.273f, 6.649f)
                close()
                moveTo(11.029f, 5.286f)
                lineTo(8.312f, 6.065f)
                lineTo(6.598f, 9.156f)
                lineTo(9.316f, 8.377f)
                lineTo(11.029f, 5.286f)
                close()
                moveTo(15.787f, 3.921f)
                lineTo(13.069f, 4.701f)
                lineTo(11.356f, 7.792f)
                lineTo(14.072f, 7.013f)
                lineTo(15.787f, 3.921f)
                close()
                moveTo(17.634f, 3.688f)
                lineTo(16.113f, 6.427f)
                lineTo(18.681f, 5.691f)
                lineTo(18.338f, 4.49f)
                curveTo(18.231f, 4.116f, 17.965f, 3.831f, 17.634f, 3.688f)
                close()
            }
        }.build()

        return _MoviesAndTv!!
    }

@Suppress("ObjectPropertyName")
private var _MoviesAndTv: ImageVector? = null

@Preview
@Composable
private fun MoviesAndTvPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MoviesAndTv, contentDescription = null)
    }
}
