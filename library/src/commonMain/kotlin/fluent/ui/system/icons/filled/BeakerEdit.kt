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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.BeakerEdit: ImageVector
    get() {
        if (_BeakerEdit != null) {
            return _BeakerEdit!!
        }
        _BeakerEdit = ImageVector.Builder(
            name = "Filled.BeakerEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 3.5f)
                verticalLineTo(9.738f)
                curveTo(7f, 10.113f, 6.906f, 10.482f, 6.727f, 10.812f)
                lineTo(5.539f, 13f)
                horizontalLineTo(14.46f)
                lineTo(13.273f, 10.812f)
                curveTo(13.094f, 10.482f, 13f, 10.113f, 13f, 9.738f)
                verticalLineTo(3.5f)
                horizontalLineTo(14f)
                curveTo(14.414f, 3.5f, 14.75f, 3.164f, 14.75f, 2.75f)
                curveTo(14.75f, 2.336f, 14.414f, 2f, 14f, 2f)
                horizontalLineTo(6f)
                curveTo(5.586f, 2f, 5.25f, 2.336f, 5.25f, 2.75f)
                curveTo(5.25f, 3.164f, 5.586f, 3.5f, 6f, 3.5f)
                horizontalLineTo(7f)
                close()
                moveTo(15.275f, 14.5f)
                horizontalLineTo(4.725f)
                lineTo(3.143f, 17.415f)
                curveTo(2.51f, 18.581f, 3.354f, 20f, 4.681f, 20f)
                horizontalLineTo(11.415f)
                lineTo(11.521f, 19.577f)
                curveTo(11.683f, 18.929f, 12.018f, 18.337f, 12.49f, 17.865f)
                lineTo(15.479f, 14.876f)
                lineTo(15.275f, 14.5f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
                curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _BeakerEdit!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerEdit: ImageVector? = null

@Preview
@Composable
private fun BeakerEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BeakerEdit, contentDescription = null)
    }
}
