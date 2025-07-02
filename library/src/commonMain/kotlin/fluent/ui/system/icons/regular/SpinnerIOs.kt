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
 * SpinnerIOs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: spinner, ios
 * - Source: ic_fluent_spinner_ios_20_regular.svg
 * 
 * @return The [ImageVector] for the SpinnerIOs icon.
 */
public val FluentIcons.Regular.SpinnerIOs: ImageVector
    get() {
        if (_spinnerIOs != null) {
            return _spinnerIOs!!
        }
        _spinnerIOs = Builder(name = "SpinnerIOs", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveTo(6.134f, 3.0f, 3.0f, 6.134f, 3.0f, 10.0f)
                curveTo(3.0f, 10.276f, 2.776f, 10.5f, 2.5f, 10.5f)
                curveTo(2.224f, 10.5f, 2.0f, 10.276f, 2.0f, 10.0f)
                curveTo(2.0f, 5.582f, 5.582f, 2.0f, 10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.582f, 18.0f, 10.0f)
                curveTo(18.0f, 14.418f, 14.418f, 18.0f, 10.0f, 18.0f)
                curveTo(9.724f, 18.0f, 9.5f, 17.776f, 9.5f, 17.5f)
                curveTo(9.5f, 17.224f, 9.724f, 17.0f, 10.0f, 17.0f)
                curveTo(13.866f, 17.0f, 17.0f, 13.866f, 17.0f, 10.0f)
                curveTo(17.0f, 6.134f, 13.866f, 3.0f, 10.0f, 3.0f)
                close()
            }
        }
        .build()
        return _spinnerIOs!!
    }

@Suppress("ObjectPropertyName")
private var _spinnerIOs: ImageVector? = null

@Preview
@Composable
private fun SpinnerIOsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SpinnerIOs, contentDescription = null)
    }
}

