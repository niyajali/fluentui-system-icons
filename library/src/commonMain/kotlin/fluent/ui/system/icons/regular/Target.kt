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
 * Target icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: target
 * - Source: ic_fluent_target_24_regular.svg
 * 
 * @return The [ImageVector] for the Target icon.
 */
public val FluentIcons.Regular.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.998f, 14.0f)
                curveTo(13.103f, 14.0f, 13.998f, 13.105f, 13.998f, 12.0f)
                curveTo(13.998f, 10.896f, 13.103f, 10.0f, 11.998f, 10.0f)
                curveTo(10.894f, 10.0f, 9.998f, 10.896f, 9.998f, 12.0f)
                curveTo(9.998f, 13.105f, 10.894f, 14.0f, 11.998f, 14.0f)
                close()
                moveTo(5.998f, 12.0f)
                curveTo(5.998f, 8.686f, 8.684f, 6.0f, 11.998f, 6.0f)
                curveTo(15.312f, 6.0f, 17.998f, 8.686f, 17.998f, 12.0f)
                curveTo(17.998f, 15.314f, 15.312f, 18.0f, 11.998f, 18.0f)
                curveTo(8.684f, 18.0f, 5.998f, 15.314f, 5.998f, 12.0f)
                close()
                moveTo(11.998f, 7.5f)
                curveTo(9.513f, 7.5f, 7.498f, 9.515f, 7.498f, 12.0f)
                curveTo(7.498f, 14.485f, 9.513f, 16.5f, 11.998f, 16.5f)
                curveTo(14.483f, 16.5f, 16.498f, 14.485f, 16.498f, 12.0f)
                curveTo(16.498f, 9.515f, 14.483f, 7.5f, 11.998f, 7.5f)
                close()
                moveTo(1.996f, 12.0f)
                curveTo(1.996f, 6.476f, 6.474f, 1.998f, 11.998f, 1.998f)
                curveTo(17.522f, 1.998f, 22.0f, 6.476f, 22.0f, 12.0f)
                curveTo(22.0f, 17.524f, 17.522f, 22.002f, 11.998f, 22.002f)
                curveTo(6.474f, 22.002f, 1.996f, 17.524f, 1.996f, 12.0f)
                close()
                moveTo(11.998f, 3.498f)
                curveTo(7.303f, 3.498f, 3.496f, 7.305f, 3.496f, 12.0f)
                curveTo(3.496f, 16.696f, 7.303f, 20.502f, 11.998f, 20.502f)
                curveTo(16.694f, 20.502f, 20.5f, 16.696f, 20.5f, 12.0f)
                curveTo(20.5f, 7.305f, 16.694f, 3.498f, 11.998f, 3.498f)
                close()
            }
        }
        .build()
        return _target!!
    }

@Suppress("ObjectPropertyName")
private var _target: ImageVector? = null

@Preview
@Composable
private fun TargetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Target, contentDescription = null)
    }
}

