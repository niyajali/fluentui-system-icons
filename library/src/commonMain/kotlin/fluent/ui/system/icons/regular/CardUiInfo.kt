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
 * CardUiInfo Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent viewing additional information on any card or modal UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_card_ui_info_24_regular.svg)
 * 
 * @return The [ImageVector] for the CardUiInfo icon.
 */
public val FluentIcons.Regular.CardUiInfo: ImageVector
    get() {
        if (_cardUiInfo != null) {
            return _cardUiInfo!!
        }
        _cardUiInfo = Builder(name = "CardUiInfo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveTo(19.866f, 9.0f, 23.0f, 12.134f, 23.0f, 16.0f)
                curveTo(23.0f, 19.866f, 19.866f, 23.0f, 16.0f, 23.0f)
                curveTo(12.134f, 23.0f, 9.0f, 19.866f, 9.0f, 16.0f)
                curveTo(9.0f, 12.134f, 12.134f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(12.962f, 10.5f, 10.5f, 12.962f, 10.5f, 16.0f)
                curveTo(10.5f, 19.038f, 12.962f, 21.5f, 16.0f, 21.5f)
                curveTo(19.038f, 21.5f, 21.5f, 19.038f, 21.5f, 16.0f)
                curveTo(21.5f, 12.962f, 19.038f, 10.5f, 16.0f, 10.5f)
                close()
                moveTo(16.0f, 15.75f)
                curveTo(16.414f, 15.75f, 16.75f, 16.086f, 16.75f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(16.75f, 18.914f, 16.414f, 19.25f, 16.0f, 19.25f)
                curveTo(15.586f, 19.25f, 15.25f, 18.914f, 15.25f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(15.25f, 16.086f, 15.586f, 15.75f, 16.0f, 15.75f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(15.545f, 2.0f, 17.0f, 3.455f, 17.0f, 5.25f)
                verticalLineTo(8.063f)
                curveTo(16.672f, 8.023f, 16.339f, 8.0f, 16.0f, 8.0f)
                curveTo(15.832f, 8.0f, 15.665f, 8.006f, 15.5f, 8.017f)
                verticalLineTo(5.25f)
                curveTo(15.5f, 4.284f, 14.717f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(13.75f)
                curveTo(3.5f, 14.717f, 4.284f, 15.5f, 5.25f, 15.5f)
                horizontalLineTo(8.018f)
                curveTo(8.007f, 15.665f, 8.0f, 15.832f, 8.0f, 16.0f)
                curveTo(8.0f, 16.339f, 8.024f, 16.672f, 8.064f, 17.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 17.0f, 2.0f, 15.545f, 2.0f, 13.75f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 3.455f, 3.455f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.0f, 12.5f)
                curveTo(16.552f, 12.5f, 17.0f, 12.948f, 17.0f, 13.5f)
                curveTo(17.0f, 14.052f, 16.552f, 14.5f, 16.0f, 14.5f)
                curveTo(15.448f, 14.5f, 15.0f, 14.052f, 15.0f, 13.5f)
                curveTo(15.0f, 12.948f, 15.448f, 12.5f, 16.0f, 12.5f)
                close()
                moveTo(8.75f, 9.0f)
                curveTo(9.164f, 9.0f, 9.5f, 9.336f, 9.5f, 9.75f)
                curveTo(9.5f, 10.164f, 9.164f, 10.5f, 8.75f, 10.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 10.5f, 5.5f, 10.164f, 5.5f, 9.75f)
                curveTo(5.5f, 9.336f, 5.836f, 9.0f, 6.25f, 9.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(12.75f, 5.5f)
                curveTo(13.164f, 5.5f, 13.5f, 5.836f, 13.5f, 6.25f)
                curveTo(13.5f, 6.664f, 13.164f, 7.0f, 12.75f, 7.0f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 7.0f, 5.5f, 6.664f, 5.5f, 6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _cardUiInfo!!
    }

@Suppress("ObjectPropertyName")
private var _cardUiInfo: ImageVector? = null

@Preview
@Composable
private fun CardUiInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CardUiInfo, contentDescription = "CardUiInfo Icon")
    }
}

