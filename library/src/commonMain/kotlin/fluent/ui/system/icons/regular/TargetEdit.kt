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
 * TargetEdit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: target, edit
 * - Source: ic_fluent_target_edit_24_regular.svg
 * 
 * @return The [ImageVector] for the TargetEdit icon.
 */
public val FluentIcons.Regular.TargetEdit: ImageVector
    get() {
        if (_targetEdit != null) {
            return _targetEdit!!
        }
        _targetEdit = Builder(name = "TargetEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.999f, 14.0f)
                curveTo(13.104f, 14.0f, 13.999f, 13.105f, 13.999f, 12.0f)
                curveTo(13.999f, 10.896f, 13.104f, 10.001f, 11.999f, 10.001f)
                curveTo(10.895f, 10.001f, 10.0f, 10.896f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 11.999f, 14.0f)
                close()
                moveTo(6.001f, 12.0f)
                curveTo(6.001f, 8.687f, 8.687f, 6.001f, 11.999f, 6.001f)
                curveTo(15.312f, 6.001f, 17.998f, 8.687f, 17.998f, 12.0f)
                curveTo(17.998f, 12.124f, 17.994f, 12.247f, 17.987f, 12.368f)
                lineTo(15.328f, 15.028f)
                curveTo(16.055f, 14.228f, 16.498f, 13.166f, 16.498f, 12.0f)
                curveTo(16.498f, 9.515f, 14.484f, 7.501f, 11.999f, 7.501f)
                curveTo(9.515f, 7.501f, 7.501f, 9.515f, 7.501f, 12.0f)
                curveTo(7.501f, 14.485f, 9.515f, 16.499f, 11.999f, 16.499f)
                curveTo(13.165f, 16.499f, 14.227f, 16.056f, 15.026f, 15.329f)
                lineTo(12.491f, 17.864f)
                curveTo(12.451f, 17.904f, 12.412f, 17.946f, 12.373f, 17.988f)
                curveTo(12.25f, 17.995f, 12.125f, 17.999f, 11.999f, 17.999f)
                curveTo(8.687f, 17.999f, 6.001f, 15.313f, 6.001f, 12.0f)
                close()
                moveTo(11.999f, 3.5f)
                curveTo(16.359f, 3.5f, 19.953f, 6.783f, 20.442f, 11.012f)
                curveTo(20.959f, 10.969f, 21.484f, 11.048f, 21.971f, 11.249f)
                curveTo(21.587f, 6.077f, 17.269f, 2.0f, 11.999f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.186f, 5.947f, 21.45f, 11.001f, 21.951f)
                curveTo(10.998f, 21.774f, 11.019f, 21.591f, 11.065f, 21.406f)
                lineTo(11.298f, 20.472f)
                curveTo(6.932f, 20.116f, 3.5f, 16.459f, 3.5f, 12.0f)
                curveTo(3.5f, 7.306f, 7.305f, 3.5f, 11.999f, 3.5f)
                close()
                moveTo(19.099f, 12.67f)
                lineTo(13.198f, 18.571f)
                curveTo(12.854f, 18.915f, 12.61f, 19.346f, 12.492f, 19.818f)
                lineTo(12.035f, 21.649f)
                curveTo(11.836f, 22.444f, 12.557f, 23.166f, 13.352f, 22.967f)
                lineTo(15.183f, 22.509f)
                curveTo(15.655f, 22.391f, 16.086f, 22.147f, 16.43f, 21.803f)
                lineTo(22.331f, 15.901f)
                curveTo(23.223f, 15.009f, 23.223f, 13.562f, 22.331f, 12.67f)
                curveTo(21.438f, 11.777f, 19.992f, 11.777f, 19.099f, 12.67f)
                close()
            }
        }
        .build()
        return _targetEdit!!
    }

@Suppress("ObjectPropertyName")
private var _targetEdit: ImageVector? = null

@Preview
@Composable
private fun TargetEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TargetEdit, contentDescription = null)
    }
}

