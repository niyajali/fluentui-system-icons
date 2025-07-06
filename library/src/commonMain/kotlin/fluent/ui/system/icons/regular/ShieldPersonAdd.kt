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
 * ShieldPersonAdd Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent security, safety & protection.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_shield_person_add_20_regular.svg)
 * 
 * @return The [ImageVector] for the ShieldPersonAdd icon.
 */
public val FluentIcons.Regular.ShieldPersonAdd: ImageVector
    get() {
        if (_shieldPersonAdd != null) {
            return _shieldPersonAdd!!
        }
        _shieldPersonAdd = Builder(name = "ShieldPersonAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.277f, 2.084f)
                curveTo(10.109f, 1.972f, 9.891f, 1.972f, 9.723f, 2.084f)
                curveTo(7.784f, 3.376f, 5.688f, 4.182f, 3.429f, 4.505f)
                curveTo(3.183f, 4.54f, 3.0f, 4.751f, 3.0f, 5.0f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 13.391f, 5.307f, 16.231f, 9.821f, 17.967f)
                curveTo(9.936f, 18.011f, 10.064f, 18.011f, 10.179f, 17.967f)
                lineTo(10.218f, 17.952f)
                curveTo(9.922f, 17.586f, 9.673f, 17.181f, 9.478f, 16.746f)
                curveTo(5.798f, 15.143f, 4.0f, 12.742f, 4.0f, 9.5f)
                verticalLineTo(5.428f)
                curveTo(5.985f, 5.091f, 7.853f, 4.396f, 9.599f, 3.346f)
                lineTo(10.0f, 3.097f)
                lineTo(10.401f, 3.346f)
                curveTo(12.147f, 4.396f, 14.015f, 5.091f, 16.0f, 5.428f)
                verticalLineTo(9.207f)
                curveTo(16.348f, 9.306f, 16.683f, 9.438f, 17.0f, 9.599f)
                curveTo(17.0f, 9.566f, 17.0f, 9.533f, 17.0f, 9.5f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 4.751f, 16.817f, 4.54f, 16.571f, 4.505f)
                curveTo(14.312f, 4.182f, 12.215f, 3.376f, 10.277f, 2.084f)
                close()
                moveTo(9.001f, 14.424f)
                curveTo(9.022f, 12.878f, 9.68f, 11.486f, 10.726f, 10.5f)
                horizontalLineTo(8.0f)
                curveTo(7.172f, 10.5f, 6.5f, 11.171f, 6.5f, 12.0f)
                curveTo(6.5f, 13.067f, 7.23f, 14.135f, 9.001f, 14.424f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(12.0f, 8.604f, 11.105f, 9.5f, 10.0f, 9.5f)
                curveTo(8.895f, 9.5f, 8.0f, 8.604f, 8.0f, 7.5f)
                curveTo(8.0f, 6.395f, 8.895f, 5.5f, 10.0f, 5.5f)
                curveTo(11.105f, 5.5f, 12.0f, 6.395f, 12.0f, 7.5f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(15.0f, 12.5f)
                curveTo(15.0f, 12.224f, 14.776f, 12.0f, 14.5f, 12.0f)
                curveTo(14.224f, 12.0f, 14.0f, 12.224f, 14.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                curveTo(12.0f, 14.776f, 12.224f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 16.776f, 14.224f, 17.0f, 14.5f, 17.0f)
                curveTo(14.776f, 17.0f, 15.0f, 16.776f, 15.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 15.0f, 17.0f, 14.776f, 17.0f, 14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _shieldPersonAdd!!
    }

@Suppress("ObjectPropertyName")
private var _shieldPersonAdd: ImageVector? = null

@Preview
@Composable
private fun ShieldPersonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShieldPersonAdd, contentDescription = "ShieldPersonAdd Icon")
    }
}

