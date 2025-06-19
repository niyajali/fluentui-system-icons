package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.WrenchScrewdriver: ImageVector
    get() {
        if (_WrenchScrewdriver != null) {
            return _WrenchScrewdriver!!
        }
        _WrenchScrewdriver = ImageVector.Builder(
            name = "Colored.WrenchScrewdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2BDABE),
                        0.853f to Color(0xFF0067BF)
                    ),
                    start = Offset(19.167f, -0.001f),
                    end = Offset(15.474f, 20.502f)
                )
            ) {
                moveTo(16.75f, 2f)
                curveTo(16.466f, 2f, 16.206f, 2.161f, 16.079f, 2.415f)
                lineTo(15.079f, 4.415f)
                curveTo(14.967f, 4.639f, 14.974f, 4.904f, 15.099f, 5.122f)
                lineTo(16f, 6.699f)
                verticalLineTo(12.5f)
                horizontalLineTo(19f)
                verticalLineTo(6.699f)
                lineTo(19.901f, 5.122f)
                curveTo(20.026f, 4.904f, 20.033f, 4.639f, 19.921f, 4.415f)
                lineTo(18.921f, 2.415f)
                curveTo(18.794f, 2.161f, 18.534f, 2f, 18.25f, 2f)
                horizontalLineTo(16.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(20.999f, 22.167f),
                    end = Offset(13.047f, 15.463f)
                )
            ) {
                moveTo(14f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(14f, 20.433f, 15.567f, 22f, 17.5f, 22f)
                curveTo(19.433f, 22f, 21f, 20.433f, 21f, 18.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(14f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFA43D),
                        1f to Color(0xFFFB5937)
                    ),
                    start = Offset(15.927f, 12.726f),
                    end = Offset(16.976f, 15.177f)
                )
            ) {
                moveTo(20.25f, 12f)
                curveTo(20.664f, 12f, 21f, 12.336f, 21f, 12.75f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(12.75f)
                curveTo(14f, 12.336f, 14.336f, 12f, 14.75f, 12f)
                horizontalLineTo(20.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2BDABE),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(11.167f, -1.713f),
                    end = Offset(4.557f, 22.532f)
                )
            ) {
                moveTo(8.828f, 2.212f)
                curveTo(9.034f, 2.072f, 9.295f, 2.044f, 9.526f, 2.135f)
                curveTo(11.56f, 2.942f, 13f, 4.927f, 13f, 7.25f)
                curveTo(13f, 9.374f, 11.796f, 11.215f, 10.036f, 12.132f)
                verticalLineTo(19.464f)
                curveTo(10.036f, 20.864f, 8.9f, 22f, 7.5f, 22f)
                curveTo(6.1f, 22f, 4.964f, 20.864f, 4.964f, 19.464f)
                verticalLineTo(12.132f)
                curveTo(3.204f, 11.215f, 2f, 9.374f, 2f, 7.25f)
                curveTo(2f, 4.927f, 3.44f, 2.942f, 5.473f, 2.135f)
                curveTo(5.704f, 2.044f, 5.966f, 2.073f, 6.171f, 2.212f)
                curveTo(6.377f, 2.352f, 6.5f, 2.584f, 6.5f, 2.833f)
                verticalLineTo(6.5f)
                curveTo(6.5f, 7.052f, 6.948f, 7.5f, 7.5f, 7.5f)
                curveTo(8.052f, 7.5f, 8.5f, 7.052f, 8.5f, 6.5f)
                verticalLineTo(2.833f)
                curveTo(8.5f, 2.584f, 8.623f, 2.352f, 8.828f, 2.212f)
                close()
            }
        }.build()

        return _WrenchScrewdriver!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchScrewdriver: ImageVector? = null

@Preview
@Composable
private fun WrenchScrewdriverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.WrenchScrewdriver, contentDescription = null)
    }
}
