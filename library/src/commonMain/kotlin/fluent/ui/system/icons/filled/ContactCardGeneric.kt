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

package fluent.ui.system.icons.filled

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
 * ContactCardGeneric Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used for directional indicators, links. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_contact_card_generic_24_filled.svg)
 * 
 * @return The [ImageVector] for the ContactCardGeneric icon.
 */
public val FluentIcons.Filled.ContactCardGeneric: ImageVector
    get() {
        if (_contactCardGeneric != null) {
            return _contactCardGeneric!!
        }
        _contactCardGeneric = Builder(name = "ContactCardGeneric", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.75f, 4.0f)
                curveTo(20.993f, 4.0f, 22.0f, 5.007f, 22.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.993f, 20.993f, 20.0f, 19.75f, 20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.0f, 2.0f, 18.993f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.007f, 3.007f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(6.343f, 9.0f, 5.0f, 10.343f, 5.0f, 12.0f)
                curveTo(5.0f, 13.657f, 6.343f, 15.0f, 8.0f, 15.0f)
                curveTo(9.657f, 15.0f, 11.0f, 13.657f, 11.0f, 12.0f)
                curveTo(11.0f, 10.343f, 9.657f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(13.25f, 13.0f)
                curveTo(12.836f, 13.0f, 12.5f, 13.336f, 12.5f, 13.75f)
                curveTo(12.5f, 14.164f, 12.836f, 14.5f, 13.25f, 14.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 14.5f, 18.5f, 14.164f, 18.5f, 13.75f)
                curveTo(18.5f, 13.336f, 18.164f, 13.0f, 17.75f, 13.0f)
                horizontalLineTo(13.25f)
                close()
                moveTo(8.0f, 10.5f)
                curveTo(8.828f, 10.5f, 9.5f, 11.172f, 9.5f, 12.0f)
                curveTo(9.5f, 12.828f, 8.828f, 13.5f, 8.0f, 13.5f)
                curveTo(7.172f, 13.5f, 6.5f, 12.828f, 6.5f, 12.0f)
                curveTo(6.5f, 11.172f, 7.172f, 10.5f, 8.0f, 10.5f)
                close()
                moveTo(13.25f, 9.5f)
                curveTo(12.836f, 9.5f, 12.5f, 9.836f, 12.5f, 10.25f)
                curveTo(12.5f, 10.664f, 12.836f, 11.0f, 13.25f, 11.0f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 11.0f, 18.5f, 10.664f, 18.5f, 10.25f)
                curveTo(18.5f, 9.836f, 18.164f, 9.5f, 17.75f, 9.5f)
                horizontalLineTo(13.25f)
                close()
            }
        }
        .build()
        return _contactCardGeneric!!
    }

@Suppress("ObjectPropertyName")
private var _contactCardGeneric: ImageVector? = null

@Preview
@Composable
private fun ContactCardGenericPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ContactCardGeneric, contentDescription = "ContactCardGeneric Icon")
    }
}

