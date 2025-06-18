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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.CollectionsEmpty: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CollectionsEmpty",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.066f, 8.004f)
            lineTo(11.25f, 7.999f)
            horizontalLineTo(18.75f)
            curveTo(20.483f, 7.999f, 21.899f, 9.355f, 21.995f, 11.064f)
            lineTo(22f, 11.249f)
            verticalLineTo(18.749f)
            curveTo(22f, 20.482f, 20.643f, 21.898f, 18.934f, 21.994f)
            lineTo(18.75f, 21.999f)
            horizontalLineTo(11.25f)
            curveTo(9.517f, 21.999f, 8.101f, 20.642f, 8.005f, 18.933f)
            lineTo(8f, 18.749f)
            verticalLineTo(11.249f)
            curveTo(8f, 9.516f, 9.356f, 8.099f, 11.066f, 8.004f)
            close()
            moveTo(18.75f, 9.499f)
            horizontalLineTo(11.25f)
            curveTo(10.332f, 9.499f, 9.579f, 10.206f, 9.506f, 11.105f)
            lineTo(9.5f, 11.249f)
            verticalLineTo(18.749f)
            curveTo(9.5f, 19.667f, 10.207f, 20.42f, 11.106f, 20.493f)
            lineTo(11.25f, 20.499f)
            horizontalLineTo(18.75f)
            curveTo(19.668f, 20.499f, 20.421f, 19.792f, 20.494f, 18.892f)
            lineTo(20.5f, 18.749f)
            verticalLineTo(11.249f)
            curveTo(20.5f, 10.282f, 19.716f, 9.499f, 18.75f, 9.499f)
            close()
            moveTo(15.582f, 4.233f)
            lineTo(15.634f, 4.41f)
            lineTo(16.327f, 6.998f)
            horizontalLineTo(14.774f)
            lineTo(14.186f, 4.798f)
            curveTo(13.936f, 3.864f, 12.976f, 3.31f, 12.042f, 3.56f)
            lineTo(4.798f, 5.502f)
            curveTo(3.913f, 5.739f, 3.37f, 6.612f, 3.528f, 7.497f)
            lineTo(3.56f, 7.645f)
            lineTo(5.502f, 14.889f)
            curveTo(5.694f, 15.606f, 6.304f, 16.1f, 7f, 16.176f)
            lineTo(7.001f, 17.682f)
            curveTo(5.699f, 17.605f, 4.53f, 16.744f, 4.105f, 15.454f)
            lineTo(4.053f, 15.278f)
            lineTo(2.112f, 8.033f)
            curveTo(1.663f, 6.359f, 2.607f, 4.64f, 4.233f, 4.105f)
            lineTo(4.41f, 4.053f)
            lineTo(11.654f, 2.112f)
            curveTo(13.328f, 1.663f, 15.047f, 2.607f, 15.582f, 4.233f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CollectionsEmptyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CollectionsEmpty, contentDescription = null)
    }
}
