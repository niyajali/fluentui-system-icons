/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.LearningApp: ImageVector
    get() {
        if (_LearningApp != null) {
            return _LearningApp!!
        }
        _LearningApp = ImageVector.Builder(
            name = "Regular.LearningApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.5f, 2f)
                curveTo(4.119f, 2f, 3f, 3.119f, 3f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(3f, 20.881f, 4.119f, 22f, 5.5f, 22f)
                horizontalLineTo(12.81f)
                curveTo(12.383f, 21.556f, 12.019f, 21.051f, 11.732f, 20.5f)
                horizontalLineTo(5.5f)
                curveTo(4.948f, 20.5f, 4.5f, 20.052f, 4.5f, 19.5f)
                horizontalLineTo(11.314f)
                curveTo(11.159f, 19.022f, 11.059f, 18.52f, 11.019f, 18f)
                horizontalLineTo(4.5f)
                verticalLineTo(4.5f)
                curveTo(4.5f, 3.948f, 4.948f, 3.5f, 5.5f, 3.5f)
                horizontalLineTo(17f)
                curveTo(17.552f, 3.5f, 18f, 3.948f, 18f, 4.5f)
                verticalLineTo(11.019f)
                curveTo(18.52f, 11.059f, 19.022f, 11.159f, 19.5f, 11.314f)
                verticalLineTo(4.5f)
                curveTo(19.5f, 3.119f, 18.381f, 2f, 17f, 2f)
                horizontalLineTo(5.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(16.914f, 15.097f)
                lineTo(19.72f, 16.937f)
                curveTo(19.807f, 16.993f, 19.876f, 17.068f, 19.925f, 17.16f)
                curveTo(19.975f, 17.251f, 20f, 17.35f, 20f, 17.458f)
                curveTo(20f, 17.561f, 19.976f, 17.661f, 19.928f, 17.756f)
                curveTo(19.881f, 17.85f, 19.815f, 17.926f, 19.73f, 17.982f)
                lineTo(16.923f, 19.896f)
                curveTo(16.871f, 19.931f, 16.818f, 19.957f, 16.765f, 19.974f)
                curveTo(16.713f, 19.991f, 16.657f, 20f, 16.597f, 20f)
                curveTo(16.518f, 20f, 16.442f, 19.984f, 16.37f, 19.951f)
                curveTo(16.297f, 19.917f, 16.233f, 19.872f, 16.177f, 19.816f)
                curveTo(16.123f, 19.757f, 16.08f, 19.691f, 16.047f, 19.615f)
                curveTo(16.015f, 19.54f, 16f, 19.461f, 16f, 19.379f)
                verticalLineTo(15.621f)
                curveTo(16f, 15.537f, 16.015f, 15.457f, 16.047f, 15.382f)
                curveTo(16.08f, 15.306f, 16.123f, 15.24f, 16.177f, 15.184f)
                curveTo(16.231f, 15.128f, 16.294f, 15.084f, 16.367f, 15.052f)
                curveTo(16.439f, 15.017f, 16.516f, 15f, 16.597f, 15f)
                curveTo(16.713f, 15f, 16.818f, 15.032f, 16.914f, 15.097f)
                close()
                moveTo(6f, 6f)
                curveTo(6f, 5.448f, 6.448f, 5f, 7f, 5f)
                horizontalLineTo(15f)
                curveTo(15.552f, 5f, 16f, 5.448f, 16f, 6f)
                verticalLineTo(8f)
                curveTo(16f, 8.552f, 15.552f, 9f, 15f, 9f)
                horizontalLineTo(7f)
                curveTo(6.448f, 9f, 6f, 8.552f, 6f, 8f)
                verticalLineTo(6f)
                close()
                moveTo(7.5f, 7.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()

        return _LearningApp!!
    }

@Suppress("ObjectPropertyName")
private var _LearningApp: ImageVector? = null

@Preview
@Composable
private fun LearningAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LearningApp, contentDescription = null)
    }
}
