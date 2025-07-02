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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * WindowNew icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: window, new
 * - Source: ic_fluent_window_new_24_regular.svg
 * 
 * @return The [ImageVector] for the WindowNew icon.
 */
public val FluentIcons.Regular.WindowNew: ImageVector
    get() {
        if (_windowNew != null) {
            return _windowNew!!
        }
        _windowNew = Builder(name = "WindowNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.272f, 7.25f)
                curveTo(11.272f, 6.836f, 11.607f, 6.5f, 12.022f, 6.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 6.5f, 17.5f, 6.836f, 17.5f, 7.25f)
                verticalLineTo(11.979f)
                curveTo(17.5f, 12.393f, 17.164f, 12.729f, 16.75f, 12.729f)
                curveTo(16.336f, 12.729f, 16.0f, 12.393f, 16.0f, 11.979f)
                verticalLineTo(9.061f)
                lineTo(10.78f, 14.28f)
                curveTo(10.487f, 14.573f, 10.013f, 14.573f, 9.72f, 14.28f)
                curveTo(9.427f, 13.987f, 9.427f, 13.513f, 9.72f, 13.22f)
                lineTo(14.939f, 8.0f)
                horizontalLineTo(12.022f)
                curveTo(11.607f, 8.0f, 11.272f, 7.664f, 11.272f, 7.25f)
                close()
                moveTo(6.157f, 5.25f)
                curveTo(6.579f, 3.944f, 7.804f, 3.0f, 9.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(14.838f)
                curveTo(21.0f, 16.19f, 20.174f, 17.349f, 19.0f, 17.839f)
                verticalLineTo(17.975f)
                curveTo(19.0f, 19.025f, 18.471f, 19.82f, 17.691f, 20.319f)
                curveTo(16.941f, 20.799f, 15.974f, 21.004f, 14.998f, 21.0f)
                lineTo(14.996f, 21.0f)
                lineTo(10.919f, 20.995f)
                lineTo(7.0f, 20.995f)
                curveTo(5.843f, 20.995f, 4.836f, 20.633f, 4.111f, 19.95f)
                curveTo(3.383f, 19.264f, 3.0f, 18.31f, 3.0f, 17.25f)
                verticalLineTo(8.5f)
                curveTo(3.0f, 7.635f, 3.216f, 6.817f, 3.734f, 6.204f)
                curveTo(4.268f, 5.571f, 5.044f, 5.25f, 5.956f, 5.25f)
                horizontalLineTo(6.157f)
                close()
                moveTo(6.0f, 6.75f)
                horizontalLineTo(5.956f)
                curveTo(5.412f, 6.75f, 5.085f, 6.929f, 4.88f, 7.171f)
                curveTo(4.659f, 7.433f, 4.5f, 7.865f, 4.5f, 8.5f)
                verticalLineTo(17.25f)
                curveTo(4.5f, 17.94f, 4.742f, 18.484f, 5.139f, 18.858f)
                curveTo(5.539f, 19.235f, 6.157f, 19.495f, 7.0f, 19.495f)
                lineTo(10.919f, 19.495f)
                lineTo(15.001f, 19.5f)
                lineTo(15.004f, 19.5f)
                curveTo(15.792f, 19.504f, 16.449f, 19.334f, 16.882f, 19.056f)
                curveTo(17.254f, 18.818f, 17.464f, 18.506f, 17.496f, 18.088f)
                horizontalLineTo(9.25f)
                curveTo(7.455f, 18.088f, 6.0f, 16.633f, 6.0f, 14.838f)
                verticalLineTo(6.75f)
                close()
                moveTo(9.25f, 4.5f)
                curveTo(8.283f, 4.5f, 7.5f, 5.284f, 7.5f, 6.25f)
                verticalLineTo(14.838f)
                curveTo(7.5f, 15.805f, 8.283f, 16.588f, 9.25f, 16.588f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 16.588f, 19.5f, 15.805f, 19.5f, 14.838f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(9.25f)
                close()
            }
        }
        .build()
        return _windowNew!!
    }

@Suppress("ObjectPropertyName")
private var _windowNew: ImageVector? = null

@Preview
@Composable
private fun WindowNewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowNew, contentDescription = null)
    }
}

