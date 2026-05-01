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

package fluent.ui.system.icons.light

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
 * Presenter Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used to represent presenter in digital and physical meeting & lecture scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_presenter_32_light.svg)
 * 
 * @return The [ImageVector] for the Presenter icon.
 */
public val FluentIcons.Light.Presenter: ImageVector
    get() {
        if (_presenter != null) {
            return _presenter!!
        }
        _presenter = Builder(name = "Presenter", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.97f, 16.0f)
                curveTo(27.539f, 16.0f, 28.0f, 16.462f, 28.0f, 17.03f)
                curveTo(28.0f, 17.27f, 27.917f, 17.5f, 27.767f, 17.684f)
                lineTo(27.698f, 17.759f)
                lineTo(21.0f, 24.457f)
                verticalLineTo(26.75f)
                curveTo(21.0f, 28.545f, 19.545f, 30.0f, 17.75f, 30.0f)
                horizontalLineTo(14.25f)
                curveTo(12.455f, 30.0f, 11.0f, 28.545f, 11.0f, 26.75f)
                verticalLineTo(24.457f)
                lineTo(4.302f, 17.759f)
                curveTo(4.109f, 17.566f, 4.0f, 17.303f, 4.0f, 17.03f)
                curveTo(4.0f, 16.462f, 4.461f, 16.0f, 5.03f, 16.0f)
                horizontalLineTo(26.97f)
                close()
                moveTo(5.03f, 17.0f)
                curveTo(5.014f, 17.0f, 5.0f, 17.013f, 5.0f, 17.03f)
                curveTo(5.0f, 17.038f, 5.003f, 17.046f, 5.009f, 17.052f)
                lineTo(11.854f, 23.896f)
                curveTo(11.947f, 23.99f, 12.0f, 24.117f, 12.0f, 24.25f)
                verticalLineTo(26.75f)
                curveTo(12.0f, 27.993f, 13.007f, 29.0f, 14.25f, 29.0f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 29.0f, 20.0f, 27.993f, 20.0f, 26.75f)
                verticalLineTo(24.25f)
                curveTo(20.0f, 24.117f, 20.053f, 23.99f, 20.146f, 23.896f)
                lineTo(26.991f, 17.052f)
                lineTo(27.0f, 17.03f)
                curveTo(27.0f, 17.022f, 26.997f, 17.014f, 26.991f, 17.009f)
                lineTo(26.97f, 17.0f)
                horizontalLineTo(5.03f)
                close()
                moveTo(18.25f, 11.0f)
                curveTo(20.045f, 11.0f, 21.5f, 12.455f, 21.5f, 14.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.25f)
                curveTo(20.5f, 13.007f, 19.493f, 12.0f, 18.25f, 12.0f)
                horizontalLineTo(13.75f)
                curveTo(12.507f, 12.0f, 11.5f, 13.007f, 11.5f, 14.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.25f)
                curveTo(10.5f, 12.455f, 11.955f, 11.0f, 13.75f, 11.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(16.0f, 2.0f)
                curveTo(18.071f, 2.0f, 19.75f, 3.679f, 19.75f, 5.75f)
                curveTo(19.75f, 7.821f, 18.071f, 9.5f, 16.0f, 9.5f)
                curveTo(13.929f, 9.5f, 12.25f, 7.821f, 12.25f, 5.75f)
                curveTo(12.25f, 3.679f, 13.929f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(14.481f, 3.0f, 13.25f, 4.231f, 13.25f, 5.75f)
                curveTo(13.25f, 7.269f, 14.481f, 8.5f, 16.0f, 8.5f)
                curveTo(17.519f, 8.5f, 18.75f, 7.269f, 18.75f, 5.75f)
                curveTo(18.75f, 4.231f, 17.519f, 3.0f, 16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _presenter!!
    }

@Suppress("ObjectPropertyName")
private var _presenter: ImageVector? = null

@Preview
@Composable
private fun PresenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Presenter, contentDescription = "Presenter Icon")
    }
}

