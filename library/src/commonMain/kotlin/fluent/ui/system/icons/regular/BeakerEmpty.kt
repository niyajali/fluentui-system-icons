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
 * BeakerEmpty Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon
 * - Description: Used to represent testing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_beaker_empty_16_regular.svg)
 * 
 * @return The [ImageVector] for the BeakerEmpty icon.
 */
public val FluentIcons.Regular.BeakerEmpty: ImageVector
    get() {
        if (_beakerEmpty != null) {
            return _beakerEmpty!!
        }
        _beakerEmpty = Builder(name = "BeakerEmpty", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.56f, 11.74f)
                lineTo(10.95f, 9.0f)
                lineTo(10.34f, 7.95f)
                curveTo(10.12f, 7.57f, 10.0f, 7.13f, 10.0f, 6.69f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.5f)
                curveTo(10.78f, 3.0f, 11.0f, 2.78f, 11.0f, 2.5f)
                curveTo(11.0f, 2.22f, 10.78f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(5.5f)
                curveTo(5.22f, 2.0f, 5.0f, 2.22f, 5.0f, 2.5f)
                curveTo(5.0f, 2.78f, 5.22f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.69f)
                curveTo(6.0f, 7.13f, 5.88f, 7.57f, 5.66f, 7.95f)
                lineTo(5.05f, 9.0f)
                lineTo(3.44f, 11.74f)
                curveTo(2.86f, 12.74f, 3.58f, 14.0f, 4.74f, 14.0f)
                horizontalLineTo(11.26f)
                curveTo(12.42f, 14.0f, 13.14f, 12.74f, 12.56f, 11.74f)
                close()
                moveTo(11.26f, 13.0f)
                horizontalLineTo(4.74f)
                curveTo(4.35f, 13.0f, 4.11f, 12.58f, 4.31f, 12.25f)
                lineTo(5.62f, 10.0f)
                lineTo(6.2f, 9.0f)
                lineTo(6.52f, 8.45f)
                curveTo(6.84f, 7.92f, 7.0f, 7.31f, 7.0f, 6.69f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.69f)
                curveTo(9.0f, 7.31f, 9.16f, 7.92f, 9.48f, 8.45f)
                lineTo(9.8f, 9.0f)
                lineTo(10.38f, 10.0f)
                lineTo(11.69f, 12.25f)
                curveTo(11.88f, 12.58f, 11.64f, 13.0f, 11.26f, 13.0f)
                close()
            }
        }
        .build()
        return _beakerEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _beakerEmpty: ImageVector? = null

@Preview
@Composable
private fun BeakerEmptyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BeakerEmpty, contentDescription = "BeakerEmpty Icon")
    }
}

